package datatype.accessibility.WCAG.principle1;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class ImagesOfText extends AbstractCriteria
{
    public ImagesOfText()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.ImagesOfText,
                CriteriaDatabase.CriteriaConstants.Name.ImagesOfText,
                CriteriaDatabase.CriteriaConstants.Description.ImagesOfText,
                CriteriaDatabase.CriteriaConstants.Solution.ImagesOfText );
        super.conformanceLevel = ConformanceLevel.AA;
    }
}
