package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class SectionHeadings extends AbstractCriteria
{
    public SectionHeadings()
    {
        super(CriteriaDatabase.CriteriaConstants.SectionHeadings,
                CriteriaDatabase.CriteriaConstants.SectionHeadingsName,
                CriteriaDatabase.CriteriaConstants.SectionHeadingsDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
