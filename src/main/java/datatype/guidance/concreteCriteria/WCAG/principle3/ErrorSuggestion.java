package datatype.guidance.concreteCriteria.WCAG.principle3;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class ErrorSuggestion extends AbstractCriteria
{
    public ErrorSuggestion()
    {
        super(CriteriaSetup.CriteriaConstants.ErrorSuggestion,
                CriteriaSetup.CriteriaConstants.ErrorSuggestionName,
                CriteriaSetup.CriteriaConstants.ErrorSuggestionDescription);
        super.conformanceLevel = ConformanceLevel.AA;
    }
}
