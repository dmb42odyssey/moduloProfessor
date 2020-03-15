package datatype.accessibility.WCAG.principle3;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class OnFocus extends AbstractCriteria
{
    public OnFocus()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.OnFocus,
                CriteriaDatabase.CriteriaConstants.Name.OnFocus,
                CriteriaDatabase.CriteriaConstants.Description.OnFocus,
                CriteriaDatabase.CriteriaConstants.Solution.OnFocus);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
