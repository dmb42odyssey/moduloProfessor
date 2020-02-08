package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class FocusVisible extends AbstractCriteria
{
    public FocusVisible()
    {
        super(CriteriaDatabase.CriteriaConstants.FocusVisible,
                CriteriaDatabase.CriteriaConstants.FocusVisibleName,
                CriteriaDatabase.CriteriaConstants.FocusVisibleDescription);
        super.conformanceLevel = ConformanceLevel.AA;
    }
}
