package datatype.accessibility.WCAG.principle3;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class ConsistentIdentification extends AbstractCriteria
{
    public ConsistentIdentification()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.ConsistentIdentification,
                CriteriaDatabase.CriteriaConstants.Name.ConsistentIdentification,
                CriteriaDatabase.CriteriaConstants.Description.ConsistentIdentification,
                CriteriaDatabase.CriteriaConstants.Solution.ConsistentIdentification);
        super.conformanceLevel = ConformanceLevel.AA;
    }
}
