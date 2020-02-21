package datatype.accessibility.WCAG.principle1;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class AudioControl extends AbstractCriteria
{
    public AudioControl()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.AudioControl,
                CriteriaDatabase.CriteriaConstants.Name.AudioControl,
                CriteriaDatabase.CriteriaConstants.Description.AudioControl);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
