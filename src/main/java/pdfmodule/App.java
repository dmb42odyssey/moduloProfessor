/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package pdfmodule;

import datatype.ExtractionResult;
import datatype.Font;
import datatype.Text;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import test.DrawPrintTextLocations;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) throws IOException
    {

        String path = "/home/dmb/Documents/samples/";
        String fileName = "samplePDF1";
        String ext = ".pdf";

        List<Text> texts = new ArrayList<Text>();
        List<Font> fonts = new ArrayList<Font>();


        try (PDDocument document = PDDocument.load(new File(path+fileName+ext)))
        {
            Extractor extractor = new Extractor(document,path+fileName+ext);
            ExtractionResult extractionResult = extractor.Extract();
            for(int i = 0; i < extractionResult.getText().size(); i++)
            {
                System.out.println("------ TEXT FRAGMENT: " + (i + 1) + " ------");
                System.out.print("[" + extractionResult.getText().get(i).getClassification() + "]");
                System.out.println(extractionResult.getText().get(i).getContent());
                System.out.println("Xstart: " +extractionResult.getText().get(i).getxStart());
                System.out.println("XEnd: " +extractionResult.getText().get(i).getxEnd());
                System.out.println("Ystart: " +extractionResult.getText().get(i).getyStart());
                System.out.println("XEnd: " +extractionResult.getText().get(i).getyEnd());
            }

            for(int k = 0; k < extractionResult.getImage().size(); k++)
            {
                System.out.println("------ IMAGE: " + (k + 1) + " ------");
                System.out.println("[" + extractionResult.getImage().get(k).getName()+ "]");
                System.out.println("[" + extractionResult.getImage().get(k).xobject + "]");
            }
        }

        // Analyzer analyzer = new Analyzer();
        // analyzer.analyzeDocument();

        // DrawPrintTextLocations.main(path + fileName +ext);
        System.out.println("PROGRAM ENDED SUCCESSFULLY");
    }
    /*
     * Imprimindo o texto inteiro
     */
    public static void test1(String path) throws IOException
    {
        try (PDDocument document = PDDocument.load(new File(path)))
        {
            PDFTextStripper stripper = new PDFTextStripper();
            stripper.setSortByPosition(true);
            String text = stripper.getText(document);
            System.out.println(text);

            //for (int p = 1; p <= document.getNumberOfPages(); ++p);
            //{
            //    String text = stripper.getText(document);
            //}
        }
    }

    /*
     * Imprimindo conteúdo por página.
     */
    public static void test2(String path) throws IOException
    {
        try (PDDocument document = PDDocument.load(new File(path)))
        {
            PDFTextStripper stripper = new PDFTextStripper();
            stripper.setSortByPosition(true);

            for(int p = 1; p <= document.getNumberOfPages(); ++p)
            {
                stripper.setStartPage(p);
                stripper.setEndPage(p);

                String text = stripper.getText(document);

                String pageStr = String.format("page %d", p);
                System.out.println(pageStr);
                for (int i = 0; i < pageStr.length(); ++i) {
                    System.out.print("-");
                }
                System.out.println();
                System.out.println(text);
                System.out.println();
            }
        }
    }

    public static void test4(String path) throws IOException
    {
        PrintImageLocations.test(path);
    }

    public static void test5(String path) throws IOException
    {
        Metadata.test(path);
    }

}
