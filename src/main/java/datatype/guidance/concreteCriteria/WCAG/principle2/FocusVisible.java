package datatype.guidance.concreteCriteria.WCAG.principle2;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class FocusVisible extends AbstractCriteria
{
    public FocusVisible()
    {
        super(CriteriaSetup.CriteriaConstants.FocusVisible,
                CriteriaSetup.CriteriaConstants.FocusVisibleName,
                CriteriaSetup.CriteriaConstants.FocusVisibleDescription);
        super.conformanceLevel = ConformanceLevel.AA;
    }
}
