package datatype.accessibility;

import datatype.Text;

public class Guideline extends AbstractGuideline {

    public Guideline(String id, String name, String description)
    {
        super();
        this.id = id;
        super.setName(name);
        super.setDescription(description);
    }

    public ConformanceLevel guidelineCheck()
    {
        return null;
    }
    public Text verificationMessage()
    {
        return null;
    }
}
