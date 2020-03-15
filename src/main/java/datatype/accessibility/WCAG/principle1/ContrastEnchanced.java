package datatype.accessibility.WCAG.principle1;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class ContrastEnchanced extends AbstractCriteria
{
    public ContrastEnchanced()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.ContrastEnchanced,
                CriteriaDatabase.CriteriaConstants.Name.ContrastEnchanced,
                CriteriaDatabase.CriteriaConstants.Description.ContrastEnchanced,
                CriteriaDatabase.CriteriaConstants.Solution.ContrastEnchanced );
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
