package datatype.accessibility.WCAG.principle3;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class ErrorPreventionAll extends AbstractCriteria
{
    public ErrorPreventionAll()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.ErrorPreventionAll,
                CriteriaDatabase.CriteriaConstants.Name.ErrorPreventionAll,
                CriteriaDatabase.CriteriaConstants.Description.ErrorPreventionAll);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
