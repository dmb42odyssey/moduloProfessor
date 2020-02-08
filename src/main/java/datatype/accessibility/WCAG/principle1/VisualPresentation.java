package datatype.accessibility.WCAG.principle1;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class VisualPresentation extends AbstractCriteria
{
    public VisualPresentation()
    {
        super(CriteriaDatabase.CriteriaConstants.VisualPresentation,
                CriteriaDatabase.CriteriaConstants.VisualPresentationName,
                CriteriaDatabase.CriteriaConstants.VisualPresentationDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
