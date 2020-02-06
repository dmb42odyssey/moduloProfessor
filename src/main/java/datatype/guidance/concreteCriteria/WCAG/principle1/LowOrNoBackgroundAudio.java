package datatype.guidance.concreteCriteria.WCAG.principle1;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class LowOrNoBackgroundAudio extends AbstractCriteria
{
    public LowOrNoBackgroundAudio()
    {
        super(CriteriaSetup.CriteriaConstants.LowOrNoBackgroundAudio,
                CriteriaSetup.CriteriaConstants.LowOrNoBackgroundAudioName,
                CriteriaSetup.CriteriaConstants.LowOrNoBackgroundAudioDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
