package datatype.guidance.concreteCriteria.WCAG.principle3;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class ConsistentIdentification extends AbstractCriteria
{
    public ConsistentIdentification()
    {
        super(CriteriaSetup.CriteriaConstants.ConsistentIdentification,
                CriteriaSetup.CriteriaConstants.ConsistentIdentificationName,
                CriteriaSetup.CriteriaConstants.ConsistentIdentificationDescription);
        super.conformanceLevel = ConformanceLevel.AA;
    }
}
