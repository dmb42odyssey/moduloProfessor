package datatype.guidance.concreteCriteria.WCAG.principle2;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class BypassBlocks extends AbstractCriteria
{
    public BypassBlocks()
    {
        super(CriteriaSetup.CriteriaConstants.BypassBlocks,
                CriteriaSetup.CriteriaConstants.BypassBlocksName,
                CriteriaSetup.CriteriaConstants.BypassBlocksDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }

}
