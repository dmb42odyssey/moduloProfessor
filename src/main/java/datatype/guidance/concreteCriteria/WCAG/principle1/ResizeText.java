package datatype.guidance.concreteCriteria.WCAG.principle1;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class ResizeText extends AbstractCriteria
{
    public ResizeText()
    {
        super(CriteriaSetup.CriteriaConstants.ResizeText,
                CriteriaSetup.CriteriaConstants.ResizeTextName,
                CriteriaSetup.CriteriaConstants.ResizeTextDescription);
        super.conformanceLevel = ConformanceLevel.AA;
    }
}
