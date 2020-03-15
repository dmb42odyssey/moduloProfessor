package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class ReAuthenticating extends AbstractCriteria
{
    public ReAuthenticating()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.ReAuthenticating,
                CriteriaDatabase.CriteriaConstants.Name.ReAuthenticating,
                CriteriaDatabase.CriteriaConstants.Description.ReAuthenticating,
                CriteriaDatabase.CriteriaConstants.Solution.ReAuthenticating);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
