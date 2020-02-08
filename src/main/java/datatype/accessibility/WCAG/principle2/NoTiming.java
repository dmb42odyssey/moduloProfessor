package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class NoTiming extends AbstractCriteria
{
    public NoTiming()
    {
        super(CriteriaDatabase.CriteriaConstants.NoTiming,
                CriteriaDatabase.CriteriaConstants.NoTimingName,
                CriteriaDatabase.CriteriaConstants.NoTimingDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
