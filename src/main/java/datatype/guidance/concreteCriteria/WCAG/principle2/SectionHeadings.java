package datatype.guidance.concreteCriteria.WCAG.principle2;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class SectionHeadings extends AbstractCriteria
{
    public SectionHeadings()
    {
        super(CriteriaSetup.CriteriaConstants.SectionHeadings,
                CriteriaSetup.CriteriaConstants.SectionHeadingsName,
                CriteriaSetup.CriteriaConstants.SectionHeadingsDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
