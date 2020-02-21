package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class ThreeFlashesOrBelowThreshold extends AbstractCriteria
{
    public ThreeFlashesOrBelowThreshold()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.ThreeFlashesOrBelowThreshold,
                CriteriaDatabase.CriteriaConstants.Name.ThreeFlashesOrBelowThreshold,
                CriteriaDatabase.CriteriaConstants.Description.ThreeFlashesOrBelowThreshold);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
