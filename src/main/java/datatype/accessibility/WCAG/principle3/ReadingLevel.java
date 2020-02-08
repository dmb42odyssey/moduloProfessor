package datatype.accessibility.WCAG.principle3;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class ReadingLevel extends AbstractCriteria
{
    public ReadingLevel()
    {
        super(CriteriaDatabase.CriteriaConstants.ReadingLevel,
                CriteriaDatabase.CriteriaConstants.ReadingLevelName,
                CriteriaDatabase.CriteriaConstants.ReadingLevelDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
