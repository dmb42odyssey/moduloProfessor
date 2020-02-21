package datatype.accessibility.WCAG.principle3;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class Pronunciation extends AbstractCriteria
{
    public Pronunciation()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.Pronunciation,
                CriteriaDatabase.CriteriaConstants.Name.Pronunciation,
                CriteriaDatabase.CriteriaConstants.Description.Pronunciation);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
