package datatype.accessibility.WCAG.principle3;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class Help extends AbstractCriteria
{
    public Help()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.Help,
                CriteriaDatabase.CriteriaConstants.Name.Help,
                CriteriaDatabase.CriteriaConstants.Description.Help);
        super.conformanceLevel = ConformanceLevel.AAA;
    }


}
