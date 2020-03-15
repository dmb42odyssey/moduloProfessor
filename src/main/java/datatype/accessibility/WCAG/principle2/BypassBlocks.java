package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class BypassBlocks extends AbstractCriteria
{
    public BypassBlocks()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.BypassBlocks,
                CriteriaDatabase.CriteriaConstants.Name.BypassBlocks,
                CriteriaDatabase.CriteriaConstants.Description.BypassBlocks,
                CriteriaDatabase.CriteriaConstants.Solution.BypassBlocks);
        super.conformanceLevel = ConformanceLevel.A;
    }

}
