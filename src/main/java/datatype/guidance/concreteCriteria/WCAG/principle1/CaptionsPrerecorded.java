package datatype.guidance.concreteCriteria.WCAG.principle1;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class CaptionsPrerecorded extends AbstractCriteria {


    public CaptionsPrerecorded()
    {
        super(CriteriaSetup.CriteriaConstants.CaptionsPreRecorded,
                CriteriaSetup.CriteriaConstants.CaptionsPreRecordedName,
                CriteriaSetup.CriteriaConstants.CaptionsPreRecordedDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }
    /* TRUE: has captions
     * FALSE: omitting some (subjective) dialoge, no captions
     *
     *
     *
     */
    public boolean checkIsSufficient() {


        return true;
    }
}
