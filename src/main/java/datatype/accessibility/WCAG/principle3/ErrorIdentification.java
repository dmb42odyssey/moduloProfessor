package datatype.accessibility.WCAG.principle3;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class ErrorIdentification extends AbstractCriteria
{
    public ErrorIdentification()
    {
        super(CriteriaDatabase.CriteriaConstants.ErrorIdentification,
                CriteriaDatabase.CriteriaConstants.ErrorIdentificationName,
                CriteriaDatabase.CriteriaConstants.ErrorIdentificationDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
