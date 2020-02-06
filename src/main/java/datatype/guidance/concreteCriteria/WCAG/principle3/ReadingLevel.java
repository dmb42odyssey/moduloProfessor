package datatype.guidance.concreteCriteria.WCAG.principle3;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class ReadingLevel extends AbstractCriteria
{
    public ReadingLevel()
    {
        super(CriteriaSetup.CriteriaConstants.ReadingLevel,
                CriteriaSetup.CriteriaConstants.ReadingLevelName,
                CriteriaSetup.CriteriaConstants.ReadingLevelDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
