package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class HeadingsAndLabels extends AbstractCriteria
{
    public HeadingsAndLabels()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.HeadingsAndLabels,
                CriteriaDatabase.CriteriaConstants.Name.HeadingsAndLabels,
                CriteriaDatabase.CriteriaConstants.Description.HeadingsAndLabels);
        super.conformanceLevel = ConformanceLevel.AA;
    }
}
