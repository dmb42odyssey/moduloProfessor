package datatype.guidance.concreteCriteria.WCAG.principle4;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class NameRoleValue extends AbstractCriteria
{
    public NameRoleValue()
    {
        super(CriteriaSetup.CriteriaConstants.NameRoleValue,
                CriteriaSetup.CriteriaConstants.NameRoleValueName,
                CriteriaSetup.CriteriaConstants.NameRoleValueDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
