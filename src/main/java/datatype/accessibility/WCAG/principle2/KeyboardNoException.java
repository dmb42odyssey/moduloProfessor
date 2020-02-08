package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class KeyboardNoException extends AbstractCriteria
{
    public KeyboardNoException()
    {
        super(CriteriaDatabase.CriteriaConstants.KeyboardNoException,
                CriteriaDatabase.CriteriaConstants.KeyboardNoExceptionName,
                CriteriaDatabase.CriteriaConstants.KeyboardNoExceptionDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
