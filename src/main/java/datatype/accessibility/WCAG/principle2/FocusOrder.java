package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class FocusOrder extends AbstractCriteria
{
    public FocusOrder()
    {
        super(CriteriaDatabase.CriteriaConstants.FocusOrder,
                CriteriaDatabase.CriteriaConstants.FocusOrderName,
                CriteriaDatabase.CriteriaConstants.FocusOrderDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
