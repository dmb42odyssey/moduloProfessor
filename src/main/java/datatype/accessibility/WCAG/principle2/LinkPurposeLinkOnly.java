package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class LinkPurposeLinkOnly extends AbstractCriteria
{
    public LinkPurposeLinkOnly()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.LinkPurposeLinkOnly,
                CriteriaDatabase.CriteriaConstants.Name.LinkPurposeLinkOnly,
                CriteriaDatabase.CriteriaConstants.Description.LinkPurposeLinkOnly,
                CriteriaDatabase.CriteriaConstants.Solution.LinkPurposeLinkOnly);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
