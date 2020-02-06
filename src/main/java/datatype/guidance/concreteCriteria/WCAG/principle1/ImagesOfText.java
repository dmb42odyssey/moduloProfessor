package datatype.guidance.concreteCriteria.WCAG.principle1;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class ImagesOfText extends AbstractCriteria
{
    public ImagesOfText()
    {
        super(CriteriaSetup.CriteriaConstants.ImagesOfText,
                CriteriaSetup.CriteriaConstants.ImagesOfTextName,
                CriteriaSetup.CriteriaConstants.ImagesOfTextDescription);
        super.conformanceLevel = ConformanceLevel.AA;
    }
}
