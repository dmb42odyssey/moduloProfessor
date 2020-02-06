package datatype.guidance.concreteCriteria.WCAG.principle1;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class AudioControl extends AbstractCriteria
{
    public AudioControl()
    {
        super(CriteriaSetup.CriteriaConstants.AudioControl,
                CriteriaSetup.CriteriaConstants.AudioControlName,
                CriteriaSetup.CriteriaConstants.AudioControlDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
