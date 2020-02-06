package datatype.guidance.concreteCriteria.WCAG.principle2;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class KeyboardNoException extends AbstractCriteria
{
    public KeyboardNoException()
    {
        super(CriteriaSetup.CriteriaConstants.KeyboardNoException,
                CriteriaSetup.CriteriaConstants.KeyboardNoExceptionName,
                CriteriaSetup.CriteriaConstants.KeyboardNoExceptionDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
