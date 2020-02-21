package datatype.accessibility.WCAG.principle3;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class LabelsOrInstructions extends AbstractCriteria
{
    public LabelsOrInstructions()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.LabelsOrInstructions,
                CriteriaDatabase.CriteriaConstants.Name.LabelsOrInstructions,
                CriteriaDatabase.CriteriaConstants.Description.LabelsOrInstructions);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
