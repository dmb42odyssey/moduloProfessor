package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class NoTiming extends AbstractCriteria
{
    public NoTiming()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.NoTiming,
                CriteriaDatabase.CriteriaConstants.Name.NoTiming,
                CriteriaDatabase.CriteriaConstants.Description.NoTiming);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
