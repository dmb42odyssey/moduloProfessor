package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class TimingAdjustable extends AbstractCriteria
{
    public TimingAdjustable()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.TimingAdjustable,
                CriteriaDatabase.CriteriaConstants.Name.TimingAdjustable,
                CriteriaDatabase.CriteriaConstants.Description.TimingAdjustable);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
