package datatype.guidance.concreteCriteria.WCAG.principle3;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class ChangeOnRequest extends AbstractCriteria
{
    public ChangeOnRequest()
    {
        super(CriteriaSetup.CriteriaConstants.ChangeOnRequest,
                CriteriaSetup.CriteriaConstants.ChangeOnRequestName,
                CriteriaSetup.CriteriaConstants.ChangeOnRequestDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
