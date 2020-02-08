package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class HeadingsAndLabels extends AbstractCriteria
{
    public HeadingsAndLabels()
    {
        super(CriteriaDatabase.CriteriaConstants.HeadingsAndLabels,
                CriteriaDatabase.CriteriaConstants.HeadingsAndLabelsName,
                CriteriaDatabase.CriteriaConstants.HeadingsAndLabelsDescription);
        super.conformanceLevel = ConformanceLevel.AA;
    }
}
