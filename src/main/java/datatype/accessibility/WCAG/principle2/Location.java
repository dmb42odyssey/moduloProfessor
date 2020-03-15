package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class Location extends AbstractCriteria
{
    public Location()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.Location,
                CriteriaDatabase.CriteriaConstants.Name.Location,
                CriteriaDatabase.CriteriaConstants.Description.Location,
                CriteriaDatabase.CriteriaConstants.Solution.Location);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
