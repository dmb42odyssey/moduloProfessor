package datatype.accessibility.WCAG.principle1;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class MeaningfulSequence extends AbstractCriteria {

    public MeaningfulSequence()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.MeaningfulSequence,
                CriteriaDatabase.CriteriaConstants.Name.MeaningfulSequence,
                CriteriaDatabase.CriteriaConstants.Description.MeaningfulSequence,
                CriteriaDatabase.CriteriaConstants.Solution.MeaningfulSequence);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
