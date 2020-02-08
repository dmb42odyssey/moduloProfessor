package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class TimingAdjustable extends AbstractCriteria
{
    public TimingAdjustable()
    {
        super(CriteriaDatabase.CriteriaConstants.TimingAdjustable,
                CriteriaDatabase.CriteriaConstants.TimingAdjustableName,
                CriteriaDatabase.CriteriaConstants.TimingAdjustableDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
