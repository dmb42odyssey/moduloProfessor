package datatype.accessibility.WCAG.principle1;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class ImagesOfText extends AbstractCriteria
{
    public ImagesOfText()
    {
        super(CriteriaDatabase.CriteriaConstants.ImagesOfText,
                CriteriaDatabase.CriteriaConstants.ImagesOfTextName,
                CriteriaDatabase.CriteriaConstants.ImagesOfTextDescription);
        super.conformanceLevel = ConformanceLevel.AA;
    }
}
