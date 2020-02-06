package datatype.guidance.concreteCriteria.WCAG.principle3;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class Pronunciation extends AbstractCriteria
{
    public Pronunciation()
    {
        super(CriteriaSetup.CriteriaConstants.Pronunciation,
                CriteriaSetup.CriteriaConstants.PronunciationName,
                CriteriaSetup.CriteriaConstants.PronunciationDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
