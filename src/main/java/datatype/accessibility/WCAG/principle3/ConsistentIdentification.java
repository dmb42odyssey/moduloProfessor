package datatype.accessibility.WCAG.principle3;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class ConsistentIdentification extends AbstractCriteria
{
    public ConsistentIdentification()
    {
        super(CriteriaDatabase.CriteriaConstants.ConsistentIdentification,
                CriteriaDatabase.CriteriaConstants.ConsistentIdentificationName,
                CriteriaDatabase.CriteriaConstants.ConsistentIdentificationDescription);
        super.conformanceLevel = ConformanceLevel.AA;
    }
}
