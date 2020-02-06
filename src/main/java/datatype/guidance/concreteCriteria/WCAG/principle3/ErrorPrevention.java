package datatype.guidance.concreteCriteria.WCAG.principle3;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class ErrorPrevention extends AbstractCriteria
{
    public ErrorPrevention()
    {
        super(CriteriaSetup.CriteriaConstants.ErrorPrevention,
                CriteriaSetup.CriteriaConstants.ErrorPreventionName,
                CriteriaSetup.CriteriaConstants.ErrorPreventionDescription);
        super.conformanceLevel = ConformanceLevel.AA;
    }
}
