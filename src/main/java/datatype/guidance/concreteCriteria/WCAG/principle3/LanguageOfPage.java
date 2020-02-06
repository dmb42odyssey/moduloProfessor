package datatype.guidance.concreteCriteria.WCAG.principle3;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class LanguageOfPage extends AbstractCriteria
{
    public LanguageOfPage()
    {
        super(CriteriaSetup.CriteriaConstants.LanguageOfPage,
                CriteriaSetup.CriteriaConstants.LanguageOfPageName,
                CriteriaSetup.CriteriaConstants.LanguageOfPageDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
