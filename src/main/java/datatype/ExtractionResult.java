package datatype;

import java.util.ArrayList;
import java.util.List;

/*
 * Object class to save results from the PDF extraction process.
 */
public class ExtractionResult {

    private List<Text> text;
    private List<Font> font;
    private List<Image> image;

    public ExtractionResult() {
        text = new ArrayList<Text>();
        font = new ArrayList<Font>();
        image = new ArrayList<Image>();
    }

    public List<Text> getText() { return text; }
    public List<Font> getFont() {
        return font;
    }
    public List<Image> getImage() { return image; }
}
