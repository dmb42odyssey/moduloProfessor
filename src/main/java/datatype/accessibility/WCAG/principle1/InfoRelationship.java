package datatype.accessibility.WCAG.principle1;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class InfoRelationship extends AbstractCriteria {

    public InfoRelationship()
    {
        super(CriteriaDatabase.CriteriaConstants.InfoRelationship,
                CriteriaDatabase.CriteriaConstants.InfoRelationshipName,
                CriteriaDatabase.CriteriaConstants.InfoRelationshipDescription);
        super.conformanceLevel = ConformanceLevel.A;
        super.setIsApplicable(true);
    }


}
