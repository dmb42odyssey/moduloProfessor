package datatype.accessibility.WCAG.principle1;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class InfoRelationship extends AbstractCriteria {

    public InfoRelationship()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.InfoRelationship,
                CriteriaDatabase.CriteriaConstants.Name.InfoRelationship,
                CriteriaDatabase.CriteriaConstants.Description.InfoRelationship,
                CriteriaDatabase.CriteriaConstants.Solution.InfoRelationship );
        super.conformanceLevel = ConformanceLevel.A;
    }
}
