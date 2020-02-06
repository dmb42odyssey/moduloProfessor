package datatype.guidance.concreteCriteria.WCAG.principle2;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class TimingAdjustable extends AbstractCriteria
{
    public TimingAdjustable()
    {
        super(CriteriaSetup.CriteriaConstants.TimingAdjustable,
                CriteriaSetup.CriteriaConstants.TimingAdjustableName,
                CriteriaSetup.CriteriaConstants.TimingAdjustableDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
