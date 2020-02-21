package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class LinkPurposeInContext extends AbstractCriteria
{
    public LinkPurposeInContext()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.LinkPurposeInContext,
                CriteriaDatabase.CriteriaConstants.Name.LinkPurposeInContext,
                CriteriaDatabase.CriteriaConstants.Description.LinkPurposeInContext
                );
        super.conformanceLevel = ConformanceLevel.A;
    }
}
