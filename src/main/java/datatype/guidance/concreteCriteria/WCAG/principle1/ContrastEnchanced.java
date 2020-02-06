package datatype.guidance.concreteCriteria.WCAG.principle1;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class ContrastEnchanced extends AbstractCriteria
{
    public ContrastEnchanced()
    {
        super(CriteriaSetup.CriteriaConstants.ContrastEnchanced,
                CriteriaSetup.CriteriaConstants.ContrastEnchancedName,
                CriteriaSetup.CriteriaConstants.ContrastEnchancedDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
