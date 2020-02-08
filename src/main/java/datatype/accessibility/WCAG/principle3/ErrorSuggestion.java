package datatype.accessibility.WCAG.principle3;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class ErrorSuggestion extends AbstractCriteria
{
    public ErrorSuggestion()
    {
        super(CriteriaDatabase.CriteriaConstants.ErrorSuggestion,
                CriteriaDatabase.CriteriaConstants.ErrorSuggestionName,
                CriteriaDatabase.CriteriaConstants.ErrorSuggestionDescription);
        super.conformanceLevel = ConformanceLevel.AA;
    }
}
