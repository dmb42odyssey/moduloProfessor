package datatype.accessibility.WCAG.principle1;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class LowOrNoBackgroundAudio extends AbstractCriteria
{
    public LowOrNoBackgroundAudio()
    {
        super(CriteriaDatabase.CriteriaConstants.LowOrNoBackgroundAudio,
                CriteriaDatabase.CriteriaConstants.LowOrNoBackgroundAudioName,
                CriteriaDatabase.CriteriaConstants.LowOrNoBackgroundAudioDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
