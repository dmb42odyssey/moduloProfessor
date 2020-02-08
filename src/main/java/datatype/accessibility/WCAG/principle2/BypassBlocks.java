package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class BypassBlocks extends AbstractCriteria
{
    public BypassBlocks()
    {
        super(CriteriaDatabase.CriteriaConstants.BypassBlocks,
                CriteriaDatabase.CriteriaConstants.BypassBlocksName,
                CriteriaDatabase.CriteriaConstants.BypassBlocksDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }

}
