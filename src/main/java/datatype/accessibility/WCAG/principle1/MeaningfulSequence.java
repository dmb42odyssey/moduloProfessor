package datatype.accessibility.WCAG.principle1;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class MeaningfulSequence extends AbstractCriteria {

    public MeaningfulSequence()
    {
        super(CriteriaDatabase.CriteriaConstants.MeaningfulSequence,
                CriteriaDatabase.CriteriaConstants.MeaningfulSequenceName,
                CriteriaDatabase.CriteriaConstants.MeaningfulSequenceDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
