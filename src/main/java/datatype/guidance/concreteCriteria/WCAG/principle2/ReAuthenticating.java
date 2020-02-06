package datatype.guidance.concreteCriteria.WCAG.principle2;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class ReAuthenticating extends AbstractCriteria
{
    public ReAuthenticating()
    {
        super(CriteriaSetup.CriteriaConstants.ReAuthenticating,
                CriteriaSetup.CriteriaConstants.ReAuthenticatingName,
                CriteriaSetup.CriteriaConstants.ReAuthenticatingDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
