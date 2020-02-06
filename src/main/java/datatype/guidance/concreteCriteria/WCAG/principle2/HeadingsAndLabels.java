package datatype.guidance.concreteCriteria.WCAG.principle2;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class HeadingsAndLabels extends AbstractCriteria
{
    public HeadingsAndLabels()
    {
        super(CriteriaSetup.CriteriaConstants.HeadingsAndLabels,
                CriteriaSetup.CriteriaConstants.HeadingsAndLabelsName,
                CriteriaSetup.CriteriaConstants.HeadingsAndLabelsDescription);
        super.conformanceLevel = ConformanceLevel.AA;
    }
}
