package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class Location extends AbstractCriteria
{
    public Location()
    {
        super(CriteriaDatabase.CriteriaConstants.Location,
                CriteriaDatabase.CriteriaConstants.LocationName,
                CriteriaDatabase.CriteriaConstants.LocationDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
