package datatype.accessibility.WCAG.principle3;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class LanguageOfPage extends AbstractCriteria
{
    public LanguageOfPage()
    {
        super(CriteriaDatabase.CriteriaConstants.LanguageOfPage,
                CriteriaDatabase.CriteriaConstants.LanguageOfPageName,
                CriteriaDatabase.CriteriaConstants.LanguageOfPageDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
