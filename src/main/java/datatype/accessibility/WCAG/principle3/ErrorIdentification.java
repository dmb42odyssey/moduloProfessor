package datatype.accessibility.WCAG.principle3;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class ErrorIdentification extends AbstractCriteria
{
    public ErrorIdentification()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.ErrorIdentification,
                CriteriaDatabase.CriteriaConstants.Name.ErrorIdentification,
                CriteriaDatabase.CriteriaConstants.Description.ErrorIdentification,
                CriteriaDatabase.CriteriaConstants.Solution.ErrorIdentification);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
