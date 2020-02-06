package datatype.guidance.concreteCriteria.WCAG.principle1;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class AudioOnlyLive extends AbstractCriteria
{

    public AudioOnlyLive()
    {
        super(CriteriaSetup.CriteriaConstants.AudioOnlyLive,
                CriteriaSetup.CriteriaConstants.AudioOnlyLiveName,
                CriteriaSetup.CriteriaConstants.AudioOnlyLiveDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
        // Live content is not possible in PDF
        super.setIsApplicable(false);
    }

}
