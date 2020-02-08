package datatype;

public class Text {

    private String content;
    private Font font;
    private String classification;
    private float xStart;
    private float yStart;
    private float xEnd;
    private float yEnd;

    public Text (String content, Font font) {
        this.content = content;
        this.font = font;
    }

    public String getContent()
    {
        return content;
    }
    public void setContent(String content) { this.content = content; }
    public String getClassification() { return classification; }
    public void setClassification(String classification) { this.classification = classification; }
    public float getxStart() { return xStart; }
    public void setxStart(float xStart) { this.xStart = xStart; }
    public float getyStart() { return yStart; }
    public void setYStart(float yStart) { this.yStart = yStart; }
    public float getxEnd() { return xEnd; }
    public void setxEnd(float xEnd) { this.xEnd = xEnd;}
    public float getyEnd() { return yEnd; }
    public void setyEnd(float yEnd) { this.yEnd = yEnd;}
    public Font getFont() {return font; }

    public void AppendStringToText(String string)
    {
        content = content + string;
    }

}
