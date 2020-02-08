package datatype.accessibility.WCAG.principle1;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class AudioControl extends AbstractCriteria
{
    public AudioControl()
    {
        super(CriteriaDatabase.CriteriaConstants.AudioControl,
                CriteriaDatabase.CriteriaConstants.AudioControlName,
                CriteriaDatabase.CriteriaConstants.AudioControlDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
