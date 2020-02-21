package datatype.accessibility.WCAG.principle3;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class ConsistentNavigation extends AbstractCriteria
{
    public ConsistentNavigation()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.ConsistentNavigation,
                CriteriaDatabase.CriteriaConstants.Name.ConsistentNavigation,
                CriteriaDatabase.CriteriaConstants.Description.ConsistentNavigation);
        super.conformanceLevel = ConformanceLevel.AA;
    }

}

