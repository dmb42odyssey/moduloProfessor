package datatype.guidance.concreteCriteria.WCAG.principle3;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class OnFocus extends AbstractCriteria
{
    public OnFocus()
    {
        super(CriteriaSetup.CriteriaConstants.OnFocus,
                CriteriaSetup.CriteriaConstants.OnFocusName,
                CriteriaSetup.CriteriaConstants.OnFocusDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
