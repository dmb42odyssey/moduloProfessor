package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class Keyboard extends AbstractCriteria
{
    public Keyboard()
    {
        super(CriteriaDatabase.CriteriaConstants.Keyboard,
                CriteriaDatabase.CriteriaConstants.KeyboardName,
                CriteriaDatabase.CriteriaConstants.KeyboardDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
