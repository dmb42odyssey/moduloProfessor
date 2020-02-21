package datatype.accessibility.WCAG.principle1;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class LowOrNoBackgroundAudio extends AbstractCriteria
{
    public LowOrNoBackgroundAudio()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.LowOrNoBackgroundAudio,
                CriteriaDatabase.CriteriaConstants.Name.LowOrNoBackgroundAudio,
                CriteriaDatabase.CriteriaConstants.Description.LowOrNoBackgroundAudio);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
