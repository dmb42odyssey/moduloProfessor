package datatype.guidance.concreteCriteria.WCAG.principle3;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class OnInput extends AbstractCriteria
{
    public OnInput()
    {
        super(CriteriaSetup.CriteriaConstants.OnInput,
                CriteriaSetup.CriteriaConstants.OnInputName,
                CriteriaSetup.CriteriaConstants.OnInputDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
