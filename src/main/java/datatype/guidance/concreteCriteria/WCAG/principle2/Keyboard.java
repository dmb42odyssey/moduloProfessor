package datatype.guidance.concreteCriteria.WCAG.principle2;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class Keyboard extends AbstractCriteria
{
    public Keyboard()
    {
        super(CriteriaSetup.CriteriaConstants.Keyboard,
                CriteriaSetup.CriteriaConstants.KeyboardName,
                CriteriaSetup.CriteriaConstants.KeyboardDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
