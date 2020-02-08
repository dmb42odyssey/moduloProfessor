package datatype.accessibility.WCAG.principle3;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class ChangeOnRequest extends AbstractCriteria
{
    public ChangeOnRequest()
    {
        super(CriteriaDatabase.CriteriaConstants.ChangeOnRequest,
                CriteriaDatabase.CriteriaConstants.ChangeOnRequestName,
                CriteriaDatabase.CriteriaConstants.ChangeOnRequestDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
