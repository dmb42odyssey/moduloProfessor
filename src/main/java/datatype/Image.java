package datatype;

import org.apache.pdfbox.pdmodel.graphics.PDXObject;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

public class Image {

    private String name;
    private int widthpx;
    private int heightpx;
    private float scaledWidth;
    private float scaledHeight;
    public PDImageXObject xobject;

    public Image(String name, int widthpx, int heightpx,
                 float scaledWidth, float scaledHeight, PDXObject xobject)
    {
        this.name = name;
        this.widthpx = widthpx;
        this.heightpx = heightpx;
        this.scaledWidth = scaledWidth;
        this.scaledHeight = scaledHeight;
        this.xobject = (PDImageXObject) xobject;
    }

    public void setName(String name) { this.name = name;}
    public String getName() { return name; }
    public void setWidth(int width) { this.widthpx = width;}
    public int getWidth() { return widthpx; }
    public void setHeight(int height) { this.heightpx = height; }
    public int getHeight() { return heightpx; }
    public void setScaledWidth(float scaledWidth) { this.scaledWidth = scaledWidth; }
    public float getScaledWidth() { return scaledWidth; }
    public void setScaledHeight(float scaledHeight) { this.scaledHeight = scaledHeight; }
    public float getScaledHeight() { return scaledHeight; }
    public PDImageXObject getXobject() {return xobject; }

}
