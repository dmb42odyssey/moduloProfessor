package datatype.accessibility.WCAG.principle1;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class ContrastMinimum extends AbstractCriteria
{
    public ContrastMinimum()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.ContrastMinimum,
                CriteriaDatabase.CriteriaConstants.Name.ContrastMinimum,
                CriteriaDatabase.CriteriaConstants.Description.ContrastMinimum,
                CriteriaDatabase.CriteriaConstants.Solution.ContrastMinimum);
        super.conformanceLevel = ConformanceLevel.AA;
    }
}
