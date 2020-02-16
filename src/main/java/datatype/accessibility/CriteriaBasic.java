package datatype.accessibility;

import datatype.Text;

public interface CriteriaBasic
{
    default void testSufficience(AbstractCriteria abstractCriteria)
    {
        abstractCriteria.setCurrentConformanceLevel(abstractCriteria.getConformanceLevel());
    }
}
