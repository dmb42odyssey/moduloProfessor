package datatype.guidance.concreteCriteria.WCAG.principle3;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class Abbreviations extends AbstractCriteria
{
    public Abbreviations()
    {
        super(CriteriaSetup.CriteriaConstants.Abbreviations,
                CriteriaSetup.CriteriaConstants.AbbreviationsName,
                CriteriaSetup.CriteriaConstants.AbbreviationsDescription);
        super.conformanceLevel = ConformanceLevel.AAA;

    }
}
