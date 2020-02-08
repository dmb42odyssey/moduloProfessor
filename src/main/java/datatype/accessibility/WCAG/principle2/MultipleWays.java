package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class MultipleWays extends AbstractCriteria
{
    public MultipleWays()
    {
        super(CriteriaDatabase.CriteriaConstants.MultipleWays,
                CriteriaDatabase.CriteriaConstants.MultipleWaysName,
                CriteriaDatabase.CriteriaConstants.MultipleWaysDescription);
        super.conformanceLevel = ConformanceLevel.AA;
    }
}
