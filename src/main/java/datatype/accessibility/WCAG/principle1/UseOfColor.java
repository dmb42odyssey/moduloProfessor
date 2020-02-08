package datatype.accessibility.WCAG.principle1;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class UseOfColor extends AbstractCriteria
{
    public UseOfColor()
    {
        super(CriteriaDatabase.CriteriaConstants.UseOfColor,
                CriteriaDatabase.CriteriaConstants.UseOfColorName,
                CriteriaDatabase.CriteriaConstants.UseOfColorDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }

}
