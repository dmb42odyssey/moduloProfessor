package datatype.accessibility.WCAG.principle4;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class Parsing extends AbstractCriteria
{
    public Parsing()
    {
        super(CriteriaDatabase.CriteriaConstants.Parsing,
                CriteriaDatabase.CriteriaConstants.ParsingName,
                CriteriaDatabase.CriteriaConstants.ParsingDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
