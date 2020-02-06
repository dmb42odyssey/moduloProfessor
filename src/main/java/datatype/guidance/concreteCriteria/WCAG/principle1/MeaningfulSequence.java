package datatype.guidance.concreteCriteria.WCAG.principle1;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class MeaningfulSequence extends AbstractCriteria {

    public MeaningfulSequence()
    {
        super(CriteriaSetup.CriteriaConstants.MeaningfulSequence,
                CriteriaSetup.CriteriaConstants.MeaningfulSequenceName,
                CriteriaSetup.CriteriaConstants.MeaningfulSequenceDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
