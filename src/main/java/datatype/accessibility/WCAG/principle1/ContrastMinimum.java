package datatype.accessibility.WCAG.principle1;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class ContrastMinimum extends AbstractCriteria
{
    public ContrastMinimum()
    {
        super(CriteriaDatabase.CriteriaConstants.ContrastMinimum,
                CriteriaDatabase.CriteriaConstants.ContrastMinimumName,
                CriteriaDatabase.CriteriaConstants.ContrastMinimumDescription);
        super.conformanceLevel = ConformanceLevel.AA;
    }
}
