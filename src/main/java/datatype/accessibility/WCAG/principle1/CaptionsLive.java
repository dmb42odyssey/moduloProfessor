package datatype.accessibility.WCAG.principle1;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class CaptionsLive extends AbstractCriteria
{

    public CaptionsLive()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.CaptionsLive,
                CriteriaDatabase.CriteriaConstants.Name.CaptionsLive,
                CriteriaDatabase.CriteriaConstants.Description.CaptionsLive,
                CriteriaDatabase.CriteriaConstants.Solution.CaptionsLive );
        super.conformanceLevel = ConformanceLevel.AA;
        // Live content is not possible in PDF
        super.setIsApplicable(false);
    }


}
