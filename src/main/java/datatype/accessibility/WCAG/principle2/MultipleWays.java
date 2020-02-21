package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class MultipleWays extends AbstractCriteria
{
    public MultipleWays()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.MultipleWays,
                CriteriaDatabase.CriteriaConstants.Name.MultipleWays,
                CriteriaDatabase.CriteriaConstants.Description.MultipleWays);
        super.conformanceLevel = ConformanceLevel.AA;
    }
}
