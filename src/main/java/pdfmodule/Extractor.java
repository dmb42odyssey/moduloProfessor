package pdfmodule;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import datatype.ExtractionResult;
import datatype.Font;
import datatype.Image;
import datatype.Text;
import org.apache.fontbox.util.BoundingBox;
import org.apache.pdfbox.contentstream.PDFStreamEngine;
import org.apache.pdfbox.contentstream.operator.DrawObject;
import org.apache.pdfbox.contentstream.operator.color.*;
import org.apache.pdfbox.contentstream.operator.state.*;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.ResourceCache;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType3Font;
import org.apache.pdfbox.pdmodel.graphics.color.PDColor;
import org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject;
import org.apache.pdfbox.pdmodel.graphics.state.RenderingMode;
import org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.TextPosition;

import org.apache.pdfbox.cos.COSBase;
import org.apache.pdfbox.cos.COSName;
import org.apache.pdfbox.pdmodel.graphics.PDXObject;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.apache.pdfbox.util.Matrix;
import org.apache.pdfbox.contentstream.operator.Operator;
import org.apache.pdfbox.contentstream.operator.OperatorName;

import org.apache.pdfbox.contentstream.operator.state.Concatenate;
import org.apache.pdfbox.contentstream.operator.state.Restore;
import org.apache.pdfbox.contentstream.operator.state.Save;
import org.apache.pdfbox.contentstream.operator.state.SetGraphicsStateParameters;
import org.apache.pdfbox.contentstream.operator.state.SetMatrix;

public class Extractor extends PDFTextStripper
{

    private static TextPosition oldChar = null;
    private static TextPosition newChar = null;
    private static TextPosition firstChar = null;
    private AffineTransform flipAT;
    private AffineTransform rotateAT;
    private static Text textBLock;
    private static String path = null;
    private static ExtractionResult extractionResult;
    private static List<String> tempClassification;

    public Extractor(PDDocument document, String path) throws IOException
    {
        this.document = document; // must initialize here, base class initializes too late
        this.path = path;
        extractionResult = new ExtractionResult();
        tempClassification = new ArrayList<String>();

        // Font color OPERATORS
        addOperator(new SetStrokingColorSpace());
        addOperator(new SetNonStrokingColorSpace());
        addOperator(new SetStrokingDeviceCMYKColor());
        addOperator(new SetNonStrokingDeviceCMYKColor());
        addOperator(new SetNonStrokingDeviceRGBColor());
        addOperator(new SetStrokingDeviceRGBColor());
        addOperator(new SetNonStrokingDeviceGrayColor());
        addOperator(new SetStrokingDeviceGrayColor());
        addOperator(new SetStrokingColor());
        addOperator(new SetStrokingColorN());
        addOperator(new SetNonStrokingColor());
        addOperator(new SetNonStrokingColorN());

        // Image extraction operators
        addOperator(new Concatenate());
        addOperator(new DrawObject());
        addOperator(new SetGraphicsStateParameters());
        addOperator(new Save());
        addOperator(new Restore());
        addOperator(new SetMatrix());
    }

    public static ExtractionResult Extract() throws IOException
    {
        try (PDDocument document = PDDocument.load(new File(path)))
        {
            Extractor stripper = new Extractor(document, path);
            stripper.setSortByPosition(true);

            // Text Extraction (Text (Content and structure, Font)
            for(int p = 0; p < document.getNumberOfPages(); ++p)
            {
                firstChar = null;
                oldChar = null;
                newChar = null;
                textBLock = null;

                System.out.println("---------- BEGGINING OF PAGE " + (p + 1) + "  ----------");
                stripper.stripPage(p);
                System.out.println("---------- END OF PAGE " + (p + 1) + "  ----------");
            }

            refreshTextClassification(extractionResult.getFont());
            filterTextFragments();

            // Color
            //extractFontColor();



            return extractionResult;
        }
    }

    private void stripPage(int page) throws IOException
    {
        PDPage pdPage = document.getPage(page);

        // for(PDAnnotation annotation : pdPage.getAnnotations())
        // {
        //     System.out.println("Annotation: " + annotation.getContents());
        // }


        System.out.println("xi: " + pdPage.getMediaBox().getLowerLeftX() +  "xf: " + pdPage.getMediaBox().getUpperRightX());
        System.out.println("yi: " + pdPage.getMediaBox().getLowerLeftY() +  "yf: " + pdPage.getMediaBox().getUpperRightY());


        // flip y-axis
        flipAT = new AffineTransform();
        flipAT.translate(0, pdPage.getBBox().getHeight());
        flipAT.scale(1, -1);

        // page may be rotated
        rotateAT = new AffineTransform();
        int rotation = pdPage.getRotation();
        if (rotation != 0)
        {
            PDRectangle mediaBox = pdPage.getMediaBox();
            switch (rotation)
            {
                case 90:
                    rotateAT.translate(mediaBox.getHeight(), 0);
                    break;
                case 270:
                    rotateAT.translate(0, mediaBox.getWidth());
                    break;
                case 180:
                    rotateAT.translate(mediaBox.getWidth(), mediaBox.getHeight());
                    break;
                default:
                    break;
            }
            rotateAT.rotate(Math.toRadians(rotation));
        }

        setStartPage(page + 1);
        setEndPage(page + 1);

        Writer dummy = new OutputStreamWriter(new ByteArrayOutputStream());
        writeText(document, dummy);

        // Need to create last text fragment: newcChar has the end positions.

        textBLock.setxEnd(newChar.getXDirAdj());
        textBLock.setyEnd(newChar.getYDirAdj());
        extractionResult.getText().add(textBLock);
    }

    @Override
    protected void processOperator( Operator operator, List<COSBase> operands) throws IOException
    {
        String operation = operator.getName();
        if (OperatorName.DRAW_OBJECT.equals(operation))
        {
            COSName objectName = (COSName) operands.get( 0 );
            PDXObject xobject = getResources().getXObject( objectName );

            if( xobject instanceof PDImageXObject)
            {
                PDImageXObject image = (PDImageXObject)xobject;
                int imageWidth = image.getWidth();
                int imageHeight = image.getHeight();
                System.out.println("*******************************************************************");
                System.out.println("Found image [" + objectName.getName() + "]");

                Matrix ctmNew = getGraphicsState().getCurrentTransformationMatrix();
                float imageXScale = ctmNew.getScalingFactorX();
                float imageYScale = ctmNew.getScalingFactorY();

                extractionResult.getImage().add(new Image(
                        objectName.getName(),
                        ((PDImageXObject) xobject).getWidth(),
                        ((PDImageXObject) xobject).getHeight(),
                        imageXScale,
                        imageYScale,
                        xobject
                        ));

                // position in user space units. 1 unit = 1/72 inch at 72 dpi
                System.out.println("position in PDF = " + ctmNew.getTranslateX() + ", " + ctmNew.getTranslateY() + " in user space units");
                // raw size in pixels
                System.out.println("raw image size  = " + imageWidth + ", " + imageHeight + " in pixels");
                // displayed size in user space units
                System.out.println("displayed size  = " + imageXScale + ", " + imageYScale + " in user space units");
                // displayed size in inches at 72 dpi rendering
                imageXScale /= 72;
                imageYScale /= 72;
                System.out.println("displayed size  = " + imageXScale + ", " + imageYScale + " in inches at 72 dpi rendering");
                // displayed size in millimeters at 72 dpi rendering
                imageXScale *= 25.4;
                imageYScale *= 25.4;
                System.out.println("displayed size  = " + imageXScale + ", " + imageYScale + " in millimeters at 72 dpi rendering");
                System.out.println();
            }
            else if(xobject instanceof PDFormXObject)
            {
                PDFormXObject form = (PDFormXObject)xobject;
                showForm(form);
            }
        }
        else
        {
            super.processOperator(operator, operands);
        }
    }

    @Override
    protected void processTextPosition(TextPosition text)
    {
        super.processTextPosition(text);

        PDColor strokingColor = getGraphicsState().getStrokingColor();
        PDColor getNonStrokingColor =  getGraphicsState().getNonStrokingColor();
        RenderingMode renderingMode = getGraphicsState().getTextState().getRenderingMode();


        // System.out.println("UNICODE: " + text.getUnicode());
        // System.out.println("StrokingColor: " +  strokingColor.getColorSpace().getName());

        /*
        System.out.println("R: " +  getNonStrokingColor.getComponents()[0]); // COR DE FATO
        System.out.println("G: " +  getNonStrokingColor.getComponents()[1]); // COR DE FATO
        System.out.println("B: " +  getNonStrokingColor.getComponents()[2]); // COR DE FATO
        */

    }

    /**
     * Override the default functionality of PDFTextStripper.
     */
    @Override
    protected void writeString(String string, List<TextPosition> textPositions) throws IOException
    {

        if(oldChar == null)
        {
            oldChar = textPositions.get(0);
            firstChar = oldChar;
            extractionResult.getFont().add(new Font ("Times Roman", firstChar.getFontSize()));
            tempClassification.add("paragraph");
            textBLock = new Text("", extractionResult.getFont().get(0));
            textBLock.setClassification(tempClassification.get(0));
            textBLock.setxStart(firstChar.getXDirAdj());
            textBLock.setYStart(firstChar.getYDirAdj());
        }


        // System.out.println(string);
        for (TextPosition text : textPositions)
        {

            // System.out.println("String[" + text.getXDirAdj() + ","
            //         + text.getYDirAdj() + " fs=" + text.getFontSize() + " xscale="
            //         + text.getXScale() + " height=" + text.getHeightDir() + " space="
            //         + text.getWidthOfSpace() + " width="
            //         + text.getWidthDirAdj() + "]" + text.getUnicode());

            newChar = text;
        }


        // Checking for a line break
        // System.out.println("(" + oldChar.getUnicode() + "|" + newChar.getUnicode() + ")");
        // System.out.println("STRING: " + string);
        //System.out.print("BEFORE CFUCNTION CHECK(" + oldChar.getUnicode() + "," + newChar.getUnicode() + ")");
        if(isNewTextBlock(oldChar,newChar))
        {
            // Make final changes and add our text block
            textBLock.setxEnd(oldChar.getXDirAdj());
            textBLock.setyEnd(oldChar.getYDirAdj());
            extractionResult.getText().add(textBLock);

            // Check if it's a new font
            int f = getFont(newChar,extractionResult.getFont());
            if(f == -1)
            {
                extractionResult.getFont().add(new Font("Times Roman", newChar.getFontSize()));
                Collections.sort(extractionResult.getFont(), Comparator.comparing(Font::getSize));
                addClassification();
                f = getFont(newChar,extractionResult.getFont());
            }
            // Switch to a new Text BLock
            extractionResult.getText().get(f).setClassification(tempClassification.get(f));
            textBLock = new Text(string + " ", extractionResult.getFont().get(f));
            firstChar = newChar;
            textBLock.setxStart(firstChar.getXDirAdj());
            textBLock.setYStart(firstChar.getYDirAdj());
        }
        else
        {
            textBLock.AppendStringToText(string + " ");
        }
        oldChar = newChar;
    }

    private boolean isNewTextBlock(TextPosition oldLastChar, TextPosition newLastChar) throws IOException
    {
        //System.out.print("(" + oldLastChar.getUnicode() + "," + newLastChar.getUnicode() + ")");

        Shape oldShape = calculateShape(oldLastChar);
        Shape newShape = calculateShape(newLastChar);

        //System.out.println(" -----> (" + oldShape.getBounds2D().getY()+ "|"
        // + newShape.getBounds2D().getY()  + "|"
        //        + newShape.getBounds2D().getHeight() + ")");
        //System.out.println((oldShape.getBounds2D().getY()) + "<=" +
        //        (newShape.getBounds2D().getY() - newShape.getBounds2D().getHeight()));

        return oldShape.getBounds2D().getY() * 1.01 <= (newShape.getBounds2D().getY() -
                newShape.getBounds2D().getHeight());
    }

    private Shape calculateShape(TextPosition text) throws IOException
    {
        AffineTransform at = text.getTextMatrix().createAffineTransform();
        PDFont font = text.getFont();
        BoundingBox bbox = font.getBoundingBox();

        float xadvance = font.getWidth(text.getCharacterCodes()[0]);
        Rectangle2D rect = new Rectangle2D.Float(0, bbox.getLowerLeftY(), xadvance, bbox.getHeight());

        if (font instanceof PDType3Font)
        {
            // bbox and font matrix are unscaled
            at.concatenate(font.getFontMatrix().createAffineTransform());
        }
            else
        {
            // bbox and font matrix are already scaled to 1000
            at.scale(1/1000f, 1/1000f);
        }

        Shape s = at.createTransformedShape(rect);
        s = flipAT.createTransformedShape(s);
        s = rotateAT.createTransformedShape(s);

        return s;
    }

    private void addClassification()
    {
        // Basic implementation.
        tempClassification.add("header-" + tempClassification.size());
    }

    private static void filterTextFragments()
    {
        // Exclude useless text fragments such as page numbering

        List<Text> textToRemove = new ArrayList<>();

        for(Text text : extractionResult.getText())
        {
            // System.out.println("String: " + text.getContent());
            if(isNumber(text.getContent()))
                textToRemove.add(text);
                // extractionResult.getText().remove(text);
        }

        extractionResult.getText().removeAll(textToRemove);
    }

    private static boolean isNumber(String string)
    {
        for(int c = 0; c < string.length(); c++)
        {
            // System.out.println("char: " + string.charAt(c));
            if((string.charAt(c) < '0' || string.charAt(c) > '9') && string.charAt(c) != ' ')
            {
                return false;
            }
        }
        return true;
    }

    private static void refreshTextClassification(List<Font> fontList)
    {
        for(int f = 0; f < fontList.size(); f++)
        {
            for(Text text : extractionResult.getText())
            {
                // TO DO: Take style to consdieration?
                if(fontList.get(f).getSize() == text.getFont().getSize())
                {
                    text.setClassification(tempClassification.get(f));
                }
            }
        }
    }

    private int getFont(TextPosition tp, List<Font> fontList)
    {
        for (int i = 0; i < fontList.size(); i++)
        {
            if(tp.getFontSize() == fontList.get(i).getSize())
            {
                return i;
            }
        }
        return -1;
    }
}
