package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class FocusVisible extends AbstractCriteria
{
    public FocusVisible()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.FocusVisible,
                CriteriaDatabase.CriteriaConstants.Name.FocusVisible,
                CriteriaDatabase.CriteriaConstants.Description.FocusVisible,
                CriteriaDatabase.CriteriaConstants.Solution.FocusVisible);
        super.conformanceLevel = ConformanceLevel.AA;
    }
}
