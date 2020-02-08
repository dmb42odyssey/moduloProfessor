package datatype.accessibility.WCAG.principle1;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class CaptionsLive extends AbstractCriteria
{

    public CaptionsLive()
    {
        super(CriteriaDatabase.CriteriaConstants.CaptionsLive,
                CriteriaDatabase.CriteriaConstants.CaptionsLiveName,
                CriteriaDatabase.CriteriaConstants.CaptionsLiveDescription);
        super.conformanceLevel = ConformanceLevel.AA;
        // Live content is not possible in PDF
        super.setIsApplicable(false);
    }


}
