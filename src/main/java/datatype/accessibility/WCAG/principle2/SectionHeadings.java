package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class SectionHeadings extends AbstractCriteria
{
    public SectionHeadings()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.SectionHeadings,
                CriteriaDatabase.CriteriaConstants.Name.SectionHeadings,
                CriteriaDatabase.CriteriaConstants.Description.SectionHeadings);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
