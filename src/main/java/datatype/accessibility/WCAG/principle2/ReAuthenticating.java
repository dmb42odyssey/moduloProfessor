package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class ReAuthenticating extends AbstractCriteria
{
    public ReAuthenticating()
    {
        super(CriteriaDatabase.CriteriaConstants.ReAuthenticating,
                CriteriaDatabase.CriteriaConstants.ReAuthenticatingName,
                CriteriaDatabase.CriteriaConstants.ReAuthenticatingDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
