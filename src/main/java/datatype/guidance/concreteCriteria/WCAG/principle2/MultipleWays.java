package datatype.guidance.concreteCriteria.WCAG.principle2;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class MultipleWays extends AbstractCriteria
{
    public MultipleWays()
    {
        super(CriteriaSetup.CriteriaConstants.MultipleWays,
                CriteriaSetup.CriteriaConstants.MultipleWaysName,
                CriteriaSetup.CriteriaConstants.MultipleWaysDescription);
        super.conformanceLevel = ConformanceLevel.AA;
    }
}
