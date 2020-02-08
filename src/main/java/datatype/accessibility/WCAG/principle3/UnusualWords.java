package datatype.accessibility.WCAG.principle3;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class UnusualWords extends AbstractCriteria
{
    public UnusualWords()
    {
        super(CriteriaDatabase.CriteriaConstants.UnusualWords,
                CriteriaDatabase.CriteriaConstants.UnusualWordsName,
                CriteriaDatabase.CriteriaConstants.UnusualWordsDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
