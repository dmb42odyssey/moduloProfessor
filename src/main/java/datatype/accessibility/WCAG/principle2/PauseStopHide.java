package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class PauseStopHide extends AbstractCriteria
{
    public PauseStopHide()
    {
        super(CriteriaDatabase.CriteriaConstants.PauseStopHide,
                CriteriaDatabase.CriteriaConstants.PauseStopHideName,
                CriteriaDatabase.CriteriaConstants.PauseStopHideDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }


}
