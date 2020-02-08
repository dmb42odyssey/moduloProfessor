package datatype.accessibility.WCAG.principle1;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class AudioOnlyLive extends AbstractCriteria
{

    public AudioOnlyLive()
    {
        super(CriteriaDatabase.CriteriaConstants.AudioOnlyLive,
                CriteriaDatabase.CriteriaConstants.AudioOnlyLiveName,
                CriteriaDatabase.CriteriaConstants.AudioOnlyLiveDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
        // Live content is not possible in PDF
        super.setIsApplicable(false);
    }

}
