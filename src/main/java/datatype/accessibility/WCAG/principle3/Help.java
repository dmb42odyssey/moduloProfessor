package datatype.accessibility.WCAG.principle3;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class Help extends AbstractCriteria
{
    public Help()
    {
        super(CriteriaDatabase.CriteriaConstants.Help,
                CriteriaDatabase.CriteriaConstants.HelpName,
                CriteriaDatabase.CriteriaConstants.HelpDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
    }


}
