package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class ThreeFlashes extends AbstractCriteria
{
    public ThreeFlashes()
    {
        super(CriteriaDatabase.CriteriaConstants.ThreeFlashes,
                CriteriaDatabase.CriteriaConstants.ThreeFlashesName,
                CriteriaDatabase.CriteriaConstants.ThreeFlashesDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
