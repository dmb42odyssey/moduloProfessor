package datatype.guidance.concreteCriteria.WCAG.principle2;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class PauseStopHide extends AbstractCriteria
{
    public PauseStopHide()
    {
        super(CriteriaSetup.CriteriaConstants.PauseStopHide,
                CriteriaSetup.CriteriaConstants.PauseStopHideName,
                CriteriaSetup.CriteriaConstants.PauseStopHideDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }


}
