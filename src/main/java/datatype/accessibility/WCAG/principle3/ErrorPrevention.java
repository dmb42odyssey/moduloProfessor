package datatype.accessibility.WCAG.principle3;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class ErrorPrevention extends AbstractCriteria
{
    public ErrorPrevention()
    {
        super(CriteriaDatabase.CriteriaConstants.ErrorPrevention,
                CriteriaDatabase.CriteriaConstants.ErrorPreventionName,
                CriteriaDatabase.CriteriaConstants.ErrorPreventionDescription);
        super.conformanceLevel = ConformanceLevel.AA;
    }
}
