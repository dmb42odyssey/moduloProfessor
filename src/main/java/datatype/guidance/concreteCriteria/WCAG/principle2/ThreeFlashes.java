package datatype.guidance.concreteCriteria.WCAG.principle2;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class ThreeFlashes extends AbstractCriteria
{
    public ThreeFlashes()
    {
        super(CriteriaSetup.CriteriaConstants.ThreeFlashes,
                CriteriaSetup.CriteriaConstants.ThreeFlashesName,
                CriteriaSetup.CriteriaConstants.ThreeFlashesDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
