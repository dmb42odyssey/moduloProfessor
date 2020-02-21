package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class FocusOrder extends AbstractCriteria
{
    public FocusOrder()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.FocusOrder,
                CriteriaDatabase.CriteriaConstants.Name.FocusOrder,
                CriteriaDatabase.CriteriaConstants.Description.FocusOrder);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
