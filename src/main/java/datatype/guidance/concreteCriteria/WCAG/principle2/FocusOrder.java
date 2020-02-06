package datatype.guidance.concreteCriteria.WCAG.principle2;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class FocusOrder extends AbstractCriteria
{
    public FocusOrder()
    {
        super(CriteriaSetup.CriteriaConstants.FocusOrder,
                CriteriaSetup.CriteriaConstants.FocusOrderName,
                CriteriaSetup.CriteriaConstants.FocusOrderDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
