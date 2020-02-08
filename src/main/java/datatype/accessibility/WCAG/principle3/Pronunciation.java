package datatype.accessibility.WCAG.principle3;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class Pronunciation extends AbstractCriteria
{
    public Pronunciation()
    {
        super(CriteriaDatabase.CriteriaConstants.Pronunciation,
                CriteriaDatabase.CriteriaConstants.PronunciationName,
                CriteriaDatabase.CriteriaConstants.PronunciationDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
