package datatype.accessibility.WCAG.principle1;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class AudioOnlyLive extends AbstractCriteria
{

    public AudioOnlyLive()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.AudioOnlyLive,
                CriteriaDatabase.CriteriaConstants.Name.AudioOnlyLive,
                CriteriaDatabase.CriteriaConstants.Description.AudioOnlyLive,
                CriteriaDatabase.CriteriaConstants.Solution.AudioOnlyLive );
        super.conformanceLevel = ConformanceLevel.AAA;
        // Live content is not possible in PDF
        super.setIsApplicable(false);
    }

}
