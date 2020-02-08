package datatype.accessibility.WCAG.principle1;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class CaptionsPrerecorded extends AbstractCriteria {


    public CaptionsPrerecorded()
    {
        super(CriteriaDatabase.CriteriaConstants.CaptionsPreRecorded,
                CriteriaDatabase.CriteriaConstants.CaptionsPreRecordedName,
                CriteriaDatabase.CriteriaConstants.CaptionsPreRecordedDescription);
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
