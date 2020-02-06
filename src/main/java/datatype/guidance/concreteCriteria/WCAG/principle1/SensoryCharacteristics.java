package datatype.guidance.concreteCriteria.WCAG.principle1;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class SensoryCharacteristics extends AbstractCriteria
{

    public SensoryCharacteristics()
    {
        super(CriteriaSetup.CriteriaConstants.SensoryCharacteristics,
                CriteriaSetup.CriteriaConstants.SensoryCharacteristicsName,
                CriteriaSetup.CriteriaConstants.SensoryCharacteristicsDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
