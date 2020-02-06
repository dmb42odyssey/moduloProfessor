package datatype.guidance.concreteCriteria.WCAG.principle1;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class UseOfColor extends AbstractCriteria
{
    public UseOfColor()
    {
        super(CriteriaSetup.CriteriaConstants.UseOfColor,
                CriteriaSetup.CriteriaConstants.UseOfColorName,
                CriteriaSetup.CriteriaConstants.UseOfColorDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }

}
