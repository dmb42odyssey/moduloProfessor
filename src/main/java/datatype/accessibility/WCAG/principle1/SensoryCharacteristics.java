package datatype.accessibility.WCAG.principle1;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class SensoryCharacteristics extends AbstractCriteria
{

    public SensoryCharacteristics()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.SensoryCharacteristics,
                CriteriaDatabase.CriteriaConstants.Name.SensoryCharacteristics,
                CriteriaDatabase.CriteriaConstants.Description.SensoryCharacteristics,
                CriteriaDatabase.CriteriaConstants.Solution.SensoryCharacteristics );
        super.conformanceLevel = ConformanceLevel.A;
    }
}
