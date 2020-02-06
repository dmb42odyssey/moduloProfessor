package datatype.guidance.concreteCriteria.WCAG.principle2;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class LinkPurposeLinkOnly extends AbstractCriteria
{
    public LinkPurposeLinkOnly()
    {
        super(CriteriaSetup.CriteriaConstants.LinkPurposeLinkOnly,
                CriteriaSetup.CriteriaConstants.LinkPurposeLinkOnlyName,
                CriteriaSetup.CriteriaConstants.LinkPurposeLinkOnlyDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
