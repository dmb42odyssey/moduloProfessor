package datatype.accessibility.WCAG.principle4;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class NameRoleValue extends AbstractCriteria
{
    public NameRoleValue()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.NameRoleValue,
                CriteriaDatabase.CriteriaConstants.Name.NameRoleValue,
                CriteriaDatabase.CriteriaConstants.Description.NameRoleValue);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
