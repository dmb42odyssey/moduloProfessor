package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class Interruptions extends AbstractCriteria
{
    public Interruptions()
    {
        super(CriteriaDatabase.CriteriaConstants.Interruptions,
                CriteriaDatabase.CriteriaConstants.InterruptionsName,
                CriteriaDatabase.CriteriaConstants.InterruptionsDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
