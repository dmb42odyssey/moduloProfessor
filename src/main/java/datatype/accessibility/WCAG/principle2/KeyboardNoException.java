package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class KeyboardNoException extends AbstractCriteria
{
    public KeyboardNoException()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.KeyboardNoException,
                CriteriaDatabase.CriteriaConstants.Name.KeyboardNoException,
                CriteriaDatabase.CriteriaConstants.Description.KeyboardNoException,
                CriteriaDatabase.CriteriaConstants.Solution.KeyboardNoException);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
