package datatype.accessibility.WCAG.principle3;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class ConsistentNavigation extends AbstractCriteria
{
    public ConsistentNavigation()
    {
        super(CriteriaDatabase.CriteriaConstants.ConsistentNavigation,
                CriteriaDatabase.CriteriaConstants.ConsistentNavigationName,
                CriteriaDatabase.CriteriaConstants.ConsistentNavigationDescription);
        super.conformanceLevel = ConformanceLevel.AA;
    }

}

