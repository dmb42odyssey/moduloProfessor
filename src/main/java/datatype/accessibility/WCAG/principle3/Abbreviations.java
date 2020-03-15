package datatype.accessibility.WCAG.principle3;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class Abbreviations extends AbstractCriteria
{
    public Abbreviations()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.Abbreviations,
                CriteriaDatabase.CriteriaConstants.Name.Abbreviations,
                CriteriaDatabase.CriteriaConstants.Description.Abbreviations,
                CriteriaDatabase.CriteriaConstants.Solution.Abbreviations);
        super.conformanceLevel = ConformanceLevel.AAA;

    }
}
