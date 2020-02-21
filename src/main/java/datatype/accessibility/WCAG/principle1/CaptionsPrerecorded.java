package datatype.accessibility.WCAG.principle1;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class CaptionsPrerecorded extends AbstractCriteria {


    public CaptionsPrerecorded()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.CaptionsPreRecorded,
                CriteriaDatabase.CriteriaConstants.Name.CaptionsPreRecorded,
                CriteriaDatabase.CriteriaConstants.Description.CaptionsPreRecorded);
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
