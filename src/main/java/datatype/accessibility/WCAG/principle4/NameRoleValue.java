package datatype.accessibility.WCAG.principle4;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class NameRoleValue extends AbstractCriteria
{
    public NameRoleValue()
    {
        super(CriteriaDatabase.CriteriaConstants.NameRoleValue,
                CriteriaDatabase.CriteriaConstants.NameRoleValueName,
                CriteriaDatabase.CriteriaConstants.NameRoleValueDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
