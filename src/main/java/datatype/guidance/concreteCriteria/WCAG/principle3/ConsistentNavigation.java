package datatype.guidance.concreteCriteria.WCAG.principle3;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class ConsistentNavigation extends AbstractCriteria
{
    public ConsistentNavigation()
    {
        super(CriteriaSetup.CriteriaConstants.ConsistentNavigation,
                CriteriaSetup.CriteriaConstants.ConsistentNavigationName,
                CriteriaSetup.CriteriaConstants.ConsistentNavigationDescription);
        super.conformanceLevel = ConformanceLevel.AA;
    }

}

