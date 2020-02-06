package datatype.guidance.concreteCriteria.WCAG.principle3;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class LanguageOfParts extends AbstractCriteria
{
    public LanguageOfParts()
    {
        super(CriteriaSetup.CriteriaConstants.LanguageOfParts,
                CriteriaSetup.CriteriaConstants.LanguageOfPartsName,
                CriteriaSetup.CriteriaConstants.LanguageOfPartsDescription);
        super.conformanceLevel = ConformanceLevel.AA;
    }
}
