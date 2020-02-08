package datatype.accessibility.WCAG.principle3;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class Abbreviations extends AbstractCriteria
{
    public Abbreviations()
    {
        super(CriteriaDatabase.CriteriaConstants.Abbreviations,
                CriteriaDatabase.CriteriaConstants.AbbreviationsName,
                CriteriaDatabase.CriteriaConstants.AbbreviationsDescription);
        super.conformanceLevel = ConformanceLevel.AAA;

    }
}
