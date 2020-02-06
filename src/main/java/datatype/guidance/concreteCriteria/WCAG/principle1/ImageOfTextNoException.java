package datatype.guidance.concreteCriteria.WCAG.principle1;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class ImageOfTextNoException extends AbstractCriteria
{
    public ImageOfTextNoException()
    {
        super(CriteriaSetup.CriteriaConstants.ImageOfTextNoException,
                CriteriaSetup.CriteriaConstants.ImageOfTextNoExceptionName,
                CriteriaSetup.CriteriaConstants.ImageOfTextNoExceptionDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
