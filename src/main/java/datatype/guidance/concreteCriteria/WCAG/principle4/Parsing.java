package datatype.guidance.concreteCriteria.WCAG.principle4;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class Parsing extends AbstractCriteria
{
    public Parsing()
    {
        super(CriteriaSetup.CriteriaConstants.Parsing,
                CriteriaSetup.CriteriaConstants.ParsingName,
                CriteriaSetup.CriteriaConstants.ParsingDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
