package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class LinkPurposeInContext extends AbstractCriteria
{
    public LinkPurposeInContext()
    {
        super(CriteriaDatabase.CriteriaConstants.LinkPurposeInContext,
                CriteriaDatabase.CriteriaConstants.LinkPurposeInContextName,
                CriteriaDatabase.CriteriaConstants.LinkPurposeInContextDescription
                );
        super.conformanceLevel = ConformanceLevel.A;
    }
}
