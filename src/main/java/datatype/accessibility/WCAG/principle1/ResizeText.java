package datatype.accessibility.WCAG.principle1;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class ResizeText extends AbstractCriteria
{
    public ResizeText()
    {
        super(CriteriaDatabase.CriteriaConstants.ResizeText,
                CriteriaDatabase.CriteriaConstants.ResizeTextName,
                CriteriaDatabase.CriteriaConstants.ResizeTextDescription);
        super.conformanceLevel = ConformanceLevel.AA;
    }
}
