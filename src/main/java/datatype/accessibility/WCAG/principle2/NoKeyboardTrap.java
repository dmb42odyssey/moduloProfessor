package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class NoKeyboardTrap extends AbstractCriteria
{
    public NoKeyboardTrap()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.NoKeyboardTrap,
                CriteriaDatabase.CriteriaConstants.Name.NoKeyboardTrap,
                CriteriaDatabase.CriteriaConstants.Description.NoKeyboardTrap);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
