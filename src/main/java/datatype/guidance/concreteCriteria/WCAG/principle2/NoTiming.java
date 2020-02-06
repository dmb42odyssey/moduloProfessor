package datatype.guidance.concreteCriteria.WCAG.principle2;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class NoTiming extends AbstractCriteria
{
    public NoTiming()
    {
        super(CriteriaSetup.CriteriaConstants.NoTiming,
                CriteriaSetup.CriteriaConstants.NoTimingName,
                CriteriaSetup.CriteriaConstants.NoTimingDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
