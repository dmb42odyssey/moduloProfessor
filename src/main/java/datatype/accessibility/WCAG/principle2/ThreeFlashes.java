package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class ThreeFlashes extends AbstractCriteria
{
    public ThreeFlashes()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.ThreeFlashes,
                CriteriaDatabase.CriteriaConstants.Name.ThreeFlashes,
                CriteriaDatabase.CriteriaConstants.Description.ThreeFlashes,
                CriteriaDatabase.CriteriaConstants.Solution.ThreeFlashes);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
