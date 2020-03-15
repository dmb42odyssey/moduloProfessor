package datatype.accessibility.WCAG.principle4;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class Parsing extends AbstractCriteria
{
    public Parsing()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.Parsing,
                CriteriaDatabase.CriteriaConstants.Name.Parsing,
                CriteriaDatabase.CriteriaConstants.Description.Parsing,
                CriteriaDatabase.CriteriaConstants.Solution.Parsing);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
