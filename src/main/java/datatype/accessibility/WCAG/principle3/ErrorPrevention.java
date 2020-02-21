package datatype.accessibility.WCAG.principle3;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class ErrorPrevention extends AbstractCriteria
{
    public ErrorPrevention()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.ErrorPrevention,
                CriteriaDatabase.CriteriaConstants.Name.ErrorPrevention,
                CriteriaDatabase.CriteriaConstants.Description.ErrorPrevention);
        super.conformanceLevel = ConformanceLevel.AA;
    }
}
