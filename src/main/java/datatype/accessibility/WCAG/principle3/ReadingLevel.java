package datatype.accessibility.WCAG.principle3;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class ReadingLevel extends AbstractCriteria
{
    public ReadingLevel()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.ReadingLevel,
                CriteriaDatabase.CriteriaConstants.Name.ReadingLevel,
                CriteriaDatabase.CriteriaConstants.Description.ReadingLevel);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
