package datatype.accessibility;

import java.util.List;

/*
 * Template for WCAG principle.
 */
public abstract class AbstractPrinciple {

    protected String id;
    protected String name;
    protected String description;
    protected List<AbstractGuideline> guidelineList;

    public String getId() { return id;}
    public void setName(String name) { this.name = name;}
    public String getName() { return name; }
    public void setDescription(String description) { this.description = description;}
    public String getDescription() { return description; }
    public List<AbstractGuideline> getGuidelineMap() { return guidelineList; }
}
