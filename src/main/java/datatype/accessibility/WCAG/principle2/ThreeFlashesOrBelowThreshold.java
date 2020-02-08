package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class ThreeFlashesOrBelowThreshold extends AbstractCriteria
{
    public ThreeFlashesOrBelowThreshold()
    {
        super(CriteriaDatabase.CriteriaConstants.ThreeFlashesOrBelowThreshold,
                CriteriaDatabase.CriteriaConstants.ThreeFlashesOrBelowThresholdName,
                CriteriaDatabase.CriteriaConstants.ThreeFlashesOrBelowThresholdDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
