package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class PauseStopHide extends AbstractCriteria
{
    public PauseStopHide()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.PauseStopHide,
                CriteriaDatabase.CriteriaConstants.Name.PauseStopHide,
                CriteriaDatabase.CriteriaConstants.Description.PauseStopHide);
        super.conformanceLevel = ConformanceLevel.A;
    }


}
