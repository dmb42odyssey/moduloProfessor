package datatype.guidance.concreteCriteria.WCAG.principle1;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class VisualPresentation extends AbstractCriteria
{
    public VisualPresentation()
    {
        super(CriteriaSetup.CriteriaConstants.VisualPresentation,
                CriteriaSetup.CriteriaConstants.VisualPresentationName,
                CriteriaSetup.CriteriaConstants.VisualPresentationDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
