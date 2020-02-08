package datatype.accessibility.WCAG.principle3;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class ErrorPreventionAll extends AbstractCriteria
{
    public ErrorPreventionAll()
    {
        super(CriteriaDatabase.CriteriaConstants.ErrorPreventionAll,
                CriteriaDatabase.CriteriaConstants.ErrorPreventionAllName,
                CriteriaDatabase.CriteriaConstants.ErrorPreventionAllDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
