package datatype.accessibility.WCAG.principle3;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class LanguageOfParts extends AbstractCriteria
{
    public LanguageOfParts()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.LanguageOfParts,
                CriteriaDatabase.CriteriaConstants.Name.LanguageOfParts,
                CriteriaDatabase.CriteriaConstants.Description.LanguageOfParts,
                CriteriaDatabase.CriteriaConstants.Solution.LanguageOfParts);
        super.conformanceLevel = ConformanceLevel.AA;
    }
}
