package datatype.accessibility.WCAG.principle1;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class UseOfColor extends AbstractCriteria
{
    public UseOfColor()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.UseOfColor,
                CriteriaDatabase.CriteriaConstants.Name.UseOfColor,
                CriteriaDatabase.CriteriaConstants.Description.UseOfColor,
                CriteriaDatabase.CriteriaConstants.Solution.UseOfColor);
        super.conformanceLevel = ConformanceLevel.A;
    }

}
