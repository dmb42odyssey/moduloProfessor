package datatype.accessibility;

import java.util.ArrayList;
import java.util.List;

/*
 * Template for WCAG criterias. Unlike the guidelines and principles
 * which work similarly, each criteria will have to define its own
 * verification method (checkIsSufficient), due to difference
 * in needed parameters (text, image, etc).
 */
public abstract class AbstractCriteria implements CriteriaBasic {

    protected String id;
    protected String name;
    protected String description;
    protected List<String> situation;
    protected ConformanceLevel conformanceLevel;
    protected ConformanceLevel currentConformanceLevel;
    // protected checkMethod
    protected boolean isApplicable;
    protected boolean isSufficient;


    public AbstractCriteria(String id, String name, String description)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        situation = new ArrayList<>();
        situation.add("A");
        currentConformanceLevel = null;


        // IF(APPPLICABLE) THEN USE OWN FUCNTION
        // ELSE
        setIsApplicable(false); // Default
    }

    public void testSufficience()
    {
        setCurrentConformanceLevel(conformanceLevel);
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
    public void setIsSufficient(boolean isSufficient) { this.isSufficient = isSufficient; }
    public boolean getIsSufficient() { return isSufficient; }
    public List<String> getSituation() { return situation; }
}
