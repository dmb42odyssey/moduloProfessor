package datatype.accessibility;

import datatype.Text;

import java.util.ArrayList;
import java.util.List;

/* Template for WCAG guidelines
 *
 */
public abstract class AbstractGuideline {

    protected String id;
    protected String name;
    protected String description;
    protected boolean isChecked;
    protected ConformanceLevel minimumPriorityStatus;
    protected List<Criteria> criteriaList;

    protected AbstractGuideline()
    {
        criteriaList = new ArrayList<>();
        isChecked = false;
        minimumPriorityStatus = null;
    }

    public String getId() { return id;}
    public void setName(String name) { this.name = name;}
    public String getName() { return name; }
    public void setDescription(String description) { this.description = description;}
    public String getDescription() { return description; }
    public void setCheckStatus(boolean checkStatus) { isChecked = checkStatus; }
    public boolean getCheckStatus() { return isChecked; }
    public List<Criteria> getCriteriaList() { return criteriaList; }

    public abstract ConformanceLevel guidelineCheck();
    public abstract Text verificationMessage();

}
