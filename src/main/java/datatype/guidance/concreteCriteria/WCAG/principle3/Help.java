package datatype.guidance.concreteCriteria.WCAG.principle3;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class Help extends AbstractCriteria
{
    public Help()
    {
        super(CriteriaSetup.CriteriaConstants.Help,
                CriteriaSetup.CriteriaConstants.HelpName,
                CriteriaSetup.CriteriaConstants.HelpDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
    }


}
