package datatype.accessibility.WCAG.principle3;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class LanguageOfParts extends AbstractCriteria
{
    public LanguageOfParts()
    {
        super(CriteriaDatabase.CriteriaConstants.LanguageOfParts,
                CriteriaDatabase.CriteriaConstants.LanguageOfPartsName,
                CriteriaDatabase.CriteriaConstants.LanguageOfPartsDescription);
        super.conformanceLevel = ConformanceLevel.AA;
    }
}
