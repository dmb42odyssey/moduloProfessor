package datatype.guidance.concreteCriteria.WCAG.principle2;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class Interruptions extends AbstractCriteria
{
    public Interruptions()
    {
        super(CriteriaSetup.CriteriaConstants.Interruptions,
                CriteriaSetup.CriteriaConstants.InterruptionsName,
                CriteriaSetup.CriteriaConstants.InterruptionsDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
