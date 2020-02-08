package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class LinkPurposeLinkOnly extends AbstractCriteria
{
    public LinkPurposeLinkOnly()
    {
        super(CriteriaDatabase.CriteriaConstants.LinkPurposeLinkOnly,
                CriteriaDatabase.CriteriaConstants.LinkPurposeLinkOnlyName,
                CriteriaDatabase.CriteriaConstants.LinkPurposeLinkOnlyDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
