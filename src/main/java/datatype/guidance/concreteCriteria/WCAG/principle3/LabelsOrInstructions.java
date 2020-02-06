package datatype.guidance.concreteCriteria.WCAG.principle3;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class LabelsOrInstructions extends AbstractCriteria
{
    public LabelsOrInstructions()
    {
        super(CriteriaSetup.CriteriaConstants.LabelsOrInstructions,
                CriteriaSetup.CriteriaConstants.LabelsOrInstructionsName,
                CriteriaSetup.CriteriaConstants.LabelsOrInstructionsDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
