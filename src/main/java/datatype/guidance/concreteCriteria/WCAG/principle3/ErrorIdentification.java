package datatype.guidance.concreteCriteria.WCAG.principle3;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class ErrorIdentification extends AbstractCriteria
{
    public ErrorIdentification()
    {
        super(CriteriaSetup.CriteriaConstants.ErrorIdentification,
                CriteriaSetup.CriteriaConstants.ErrorIdentificationName,
                CriteriaSetup.CriteriaConstants.ErrorIdentificationDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
