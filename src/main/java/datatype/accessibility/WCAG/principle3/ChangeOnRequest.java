package datatype.accessibility.WCAG.principle3;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class ChangeOnRequest extends AbstractCriteria
{
    public ChangeOnRequest()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.ChangeOnRequest,
                CriteriaDatabase.CriteriaConstants.Name.ChangeOnRequest,
                CriteriaDatabase.CriteriaConstants.Description.ChangeOnRequest,
                CriteriaDatabase.CriteriaConstants.Solution.ChangeOnRequest);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
