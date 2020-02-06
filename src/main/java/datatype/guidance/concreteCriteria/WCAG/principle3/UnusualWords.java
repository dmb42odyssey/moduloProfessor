package datatype.guidance.concreteCriteria.WCAG.principle3;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class UnusualWords extends AbstractCriteria
{
    public UnusualWords()
    {
        super(CriteriaSetup.CriteriaConstants.UnusualWords,
                CriteriaSetup.CriteriaConstants.UnusualWordsName,
                CriteriaSetup.CriteriaConstants.UnusualWordsDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
