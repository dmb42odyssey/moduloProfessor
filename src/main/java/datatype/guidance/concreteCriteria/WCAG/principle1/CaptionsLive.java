package datatype.guidance.concreteCriteria.WCAG.principle1;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class CaptionsLive extends AbstractCriteria
{

    public CaptionsLive()
    {
        super(CriteriaSetup.CriteriaConstants.CaptionsLive,
                CriteriaSetup.CriteriaConstants.CaptionsLiveName,
                CriteriaSetup.CriteriaConstants.CaptionsLiveDescription);
        super.conformanceLevel = ConformanceLevel.AA;
        // Live content is not possible in PDF
        super.setIsApplicable(false);
    }


}
