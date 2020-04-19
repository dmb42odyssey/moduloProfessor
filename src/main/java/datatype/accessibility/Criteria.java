package datatype.accessibility;

import database.CriteriaDatabase;

import java.util.ArrayList;
import java.util.List;

/*
 * Template for WCAG criterias. Unlike the guidelines and principles
 * which work similarly, each criteria will have to define its own
 * verification method which is a command class, due to difference
 * in needed parameters (text, image, etc).
 */
public class Criteria {

    protected String id;
    protected String name;
    protected String description;
    protected String solutionText;
    protected ConformanceLevel conformanceLevel;
    protected ConformanceLevel currentConformanceLevel;
    protected boolean isApplicable;

    public Criteria(String id, String name, String description, String solutionText, ConformanceLevel conformanceLevel)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.solutionText = solutionText;
        this.conformanceLevel = conformanceLevel;
        currentConformanceLevel = null;
        setIsApplicable(CriteriaDatabase.isEnabled(this));
    }

    public String getId() { return id;}
    public void setName(String name) { this.name = name;}
    public String getName() { return name; }
    public void setDescription(String description) { this.description = description; }
    public String getDescription() { return description; }
    public ConformanceLevel getConformanceLevel() { return conformanceLevel; }
    public void setCurrentConformanceLevel(ConformanceLevel currentConformanceLevel) { this.currentConformanceLevel = currentConformanceLevel; }
    public ConformanceLevel getCurrentConformanceLevel() { return currentConformanceLevel; }
    public void setIsApplicable(boolean isApplicable) { this.isApplicable = isApplicable; }
    public boolean getIsApplicable() { return isApplicable; }
    public String getSolutionText() { return solutionText; }

    public boolean isSufficient()
    {
        return conformanceLevel == currentConformanceLevel;
    }
}
