package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class NoKeyboardTrap extends AbstractCriteria
{
    public NoKeyboardTrap()
    {
        super(CriteriaDatabase.CriteriaConstants.NoKeyboardTrap,
                CriteriaDatabase.CriteriaConstants.NoKeyboardTrapName,
                CriteriaDatabase.CriteriaConstants.NoKeyboardTrapDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
