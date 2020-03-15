package datatype.accessibility.WCAG.principle1;

import database.CriteriaDatabase;
import datatype.Image;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class NonTextContext extends AbstractCriteria
{
    public NonTextContext()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.NonTextContent,
              CriteriaDatabase.CriteriaConstants.Name.NonTextContent,
              CriteriaDatabase.CriteriaConstants.Description.NonTextContent,
              CriteriaDatabase.CriteriaConstants.Solution.NonTextContent);
        super.conformanceLevel = ConformanceLevel.A;
    }
}
