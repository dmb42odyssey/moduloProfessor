package datatype.accessibility.WCAG.principle1;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class ImageOfTextNoException extends AbstractCriteria
{
    public ImageOfTextNoException()
    {
        super(CriteriaDatabase.CriteriaConstants.ImageOfTextNoException,
                CriteriaDatabase.CriteriaConstants.ImageOfTextNoExceptionName,
                CriteriaDatabase.CriteriaConstants.ImageOfTextNoExceptionDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
