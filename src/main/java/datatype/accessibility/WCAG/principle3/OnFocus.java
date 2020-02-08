package datatype.accessibility.WCAG.principle3;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class OnFocus extends AbstractCriteria
{
    public OnFocus()
    {
        super(CriteriaDatabase.CriteriaConstants.OnFocus,
                CriteriaDatabase.CriteriaConstants.OnFocusName,
                CriteriaDatabase.CriteriaConstants.OnFocusDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
