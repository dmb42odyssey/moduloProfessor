package datatype.guidance.concreteCriteria.WCAG.principle2;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class ThreeFlashesOrBelowThreshold extends AbstractCriteria
{
    public ThreeFlashesOrBelowThreshold()
    {
        super(CriteriaSetup.CriteriaConstants.ThreeFlashesOrBelowThreshold,
                CriteriaSetup.CriteriaConstants.ThreeFlashesOrBelowThresholdName,
                CriteriaSetup.CriteriaConstants.ThreeFlashesOrBelowThresholdDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
