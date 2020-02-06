package datatype.guidance.concreteCriteria.WCAG.principle3;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class ErrorPreventionAll extends AbstractCriteria
{
    public ErrorPreventionAll()
    {
        super(CriteriaSetup.CriteriaConstants.ErrorPreventionAll,
                CriteriaSetup.CriteriaConstants.ErrorPreventionAllName,
                CriteriaSetup.CriteriaConstants.ErrorPreventionAllDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
