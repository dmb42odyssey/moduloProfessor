package datatype.guidance.concreteCriteria.WCAG.principle2;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class PageTitled extends AbstractCriteria
{
    public PageTitled()
    {
        super(CriteriaSetup.CriteriaConstants.PageTitled,
                CriteriaSetup.CriteriaConstants.PageTitledName,
                CriteriaSetup.CriteriaConstants.PageTitledDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
