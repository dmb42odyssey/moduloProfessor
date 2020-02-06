package datatype.guidance.concreteCriteria.WCAG.principle2;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class LinkPurposeInContext extends AbstractCriteria
{
    public LinkPurposeInContext()
    {
        super(CriteriaSetup.CriteriaConstants.LinkPurposeInContext,
                CriteriaSetup.CriteriaConstants.LinkPurposeInContextName,
                CriteriaSetup.CriteriaConstants.LinkPurposeInContextDescription
                );
        super.conformanceLevel = ConformanceLevel.A;
    }
}
