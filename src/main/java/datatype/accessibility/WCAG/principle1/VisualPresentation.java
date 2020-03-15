package datatype.accessibility.WCAG.principle1;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class VisualPresentation extends AbstractCriteria
{
    public VisualPresentation()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.VisualPresentation,
                CriteriaDatabase.CriteriaConstants.Name.VisualPresentation,
                CriteriaDatabase.CriteriaConstants.Description.VisualPresentation,
                CriteriaDatabase.CriteriaConstants.Solution.VisualPresentation );
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
