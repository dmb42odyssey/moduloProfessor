package datatype.guidance.concreteCriteria.WCAG.principle1;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class ContrastMinimum extends AbstractCriteria
{
    public ContrastMinimum()
    {
        super(CriteriaSetup.CriteriaConstants.ContrastMinimum,
                CriteriaSetup.CriteriaConstants.ContrastMinimumName,
                CriteriaSetup.CriteriaConstants.ContrastMinimumDescription);
        super.conformanceLevel = ConformanceLevel.AA;
    }
}
