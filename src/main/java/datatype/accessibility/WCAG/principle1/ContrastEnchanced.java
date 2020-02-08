package datatype.accessibility.WCAG.principle1;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class ContrastEnchanced extends AbstractCriteria
{
    public ContrastEnchanced()
    {
        super(CriteriaDatabase.CriteriaConstants.ContrastEnchanced,
                CriteriaDatabase.CriteriaConstants.ContrastEnchancedName,
                CriteriaDatabase.CriteriaConstants.ContrastEnchancedDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
