package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class Interruptions extends AbstractCriteria
{
    public Interruptions()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.Interruptions,
                CriteriaDatabase.CriteriaConstants.Name.Interruptions,
                CriteriaDatabase.CriteriaConstants.Description.Interruptions,
                CriteriaDatabase.CriteriaConstants.Solution.Interruptions);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
