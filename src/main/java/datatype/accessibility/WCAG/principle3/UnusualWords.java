package datatype.accessibility.WCAG.principle3;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class UnusualWords extends AbstractCriteria
{
    public UnusualWords()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.UnusualWords,
                CriteriaDatabase.CriteriaConstants.Name.UnusualWords,
                CriteriaDatabase.CriteriaConstants.Description.UnusualWords,
                CriteriaDatabase.CriteriaConstants.Solution.UnusualWords);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
