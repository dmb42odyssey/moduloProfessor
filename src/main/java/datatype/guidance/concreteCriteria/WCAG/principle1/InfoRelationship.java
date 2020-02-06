package datatype.guidance.concreteCriteria.WCAG.principle1;

import database.CriteriaSetup;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class InfoRelationship extends AbstractCriteria {

    public InfoRelationship()
    {
        super(CriteriaSetup.CriteriaConstants.InfoRelationship,
                CriteriaSetup.CriteriaConstants.InfoRelationshipName,
                CriteriaSetup.CriteriaConstants.InfoRelationshipDescription);
        super.conformanceLevel = ConformanceLevel.A;
        super.setIsApplicable(true);
    }


}
