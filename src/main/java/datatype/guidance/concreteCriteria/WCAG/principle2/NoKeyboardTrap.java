package datatype.guidance.concreteCriteria.WCAG.principle2;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class NoKeyboardTrap extends AbstractCriteria
{
    public NoKeyboardTrap()
    {
        super(CriteriaSetup.CriteriaConstants.NoKeyboardTrap,
                CriteriaSetup.CriteriaConstants.NoKeyboardTrapName,
                CriteriaSetup.CriteriaConstants.NoKeyboardTrapDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
