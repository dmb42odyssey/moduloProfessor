package datatype.accessibility.WCAG.principle3;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class ErrorSuggestion extends AbstractCriteria
{
    public ErrorSuggestion()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.ErrorSuggestion,
                CriteriaDatabase.CriteriaConstants.Name.ErrorSuggestion,
                CriteriaDatabase.CriteriaConstants.Description.ErrorSuggestion,
                CriteriaDatabase.CriteriaConstants.Solution.ErrorSuggestion);
        super.conformanceLevel = ConformanceLevel.AA;
    }
}
