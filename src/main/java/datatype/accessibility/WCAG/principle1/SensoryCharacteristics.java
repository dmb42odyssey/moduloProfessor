package datatype.accessibility.WCAG.principle1;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class SensoryCharacteristics extends AbstractCriteria
{

    public SensoryCharacteristics()
    {
        super(CriteriaDatabase.CriteriaConstants.SensoryCharacteristics,
                CriteriaDatabase.CriteriaConstants.SensoryCharacteristicsName,
                CriteriaDatabase.CriteriaConstants.SensoryCharacteristicsDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
