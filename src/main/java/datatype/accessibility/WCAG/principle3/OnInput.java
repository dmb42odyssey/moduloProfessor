package datatype.accessibility.WCAG.principle3;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class OnInput extends AbstractCriteria
{
    public OnInput()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.OnInput,
                CriteriaDatabase.CriteriaConstants.Name.OnInput,
                CriteriaDatabase.CriteriaConstants.Description.OnInput,
                CriteriaDatabase.CriteriaConstants.Solution.OnInput);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
