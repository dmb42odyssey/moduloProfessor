package datatype.accessibility.WCAG.principle3;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class OnInput extends AbstractCriteria
{
    public OnInput()
    {
        super(CriteriaDatabase.CriteriaConstants.OnInput,
                CriteriaDatabase.CriteriaConstants.OnInputName,
                CriteriaDatabase.CriteriaConstants.OnInputDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
