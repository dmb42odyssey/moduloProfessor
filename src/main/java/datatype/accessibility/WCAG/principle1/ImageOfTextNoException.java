package datatype.accessibility.WCAG.principle1;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class ImageOfTextNoException extends AbstractCriteria
{
    public ImageOfTextNoException()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.ImageOfTextNoException,
                CriteriaDatabase.CriteriaConstants.Name.ImageOfTextNoException,
                CriteriaDatabase.CriteriaConstants.Description.ImageOfTextNoException);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
}
