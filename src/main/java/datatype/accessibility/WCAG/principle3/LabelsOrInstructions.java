package datatype.accessibility.WCAG.principle3;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class LabelsOrInstructions extends AbstractCriteria
{
    public LabelsOrInstructions()
    {
        super(CriteriaDatabase.CriteriaConstants.LabelsOrInstructions,
                CriteriaDatabase.CriteriaConstants.LabelsOrInstructionsName,
                CriteriaDatabase.CriteriaConstants.LabelsOrInstructionsDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
