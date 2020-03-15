package datatype.accessibility.WCAG.principle1;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class ResizeText extends AbstractCriteria
{
    public ResizeText()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.ResizeText,
                CriteriaDatabase.CriteriaConstants.Name.ResizeText,
                CriteriaDatabase.CriteriaConstants.Description.ResizeText,
                CriteriaDatabase.CriteriaConstants.Solution.ResizeText );
        super.conformanceLevel = ConformanceLevel.AA;
    }
}
