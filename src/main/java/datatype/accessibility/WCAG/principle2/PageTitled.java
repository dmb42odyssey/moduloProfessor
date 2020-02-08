package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class PageTitled extends AbstractCriteria
{
    public PageTitled()
    {
        super(CriteriaDatabase.CriteriaConstants.PageTitled,
                CriteriaDatabase.CriteriaConstants.PageTitledName,
                CriteriaDatabase.CriteriaConstants.PageTitledDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
