package datatype.guidance.concreteCriteria.WCAG.principle2;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class Location extends AbstractCriteria
{
    public Location()
    {
        super(CriteriaSetup.CriteriaConstants.Location,
                CriteriaSetup.CriteriaConstants.LocationName,
                CriteriaSetup.CriteriaConstants.LocationDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
