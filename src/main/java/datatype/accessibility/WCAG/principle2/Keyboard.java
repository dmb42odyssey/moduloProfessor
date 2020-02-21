package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class Keyboard extends AbstractCriteria
{
    public Keyboard()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.Keyboard,
                CriteriaDatabase.CriteriaConstants.Name.Keyboard,
                CriteriaDatabase.CriteriaConstants.Description.Keyboard);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
