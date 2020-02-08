package datatype.accessibility;


/*
 * ConformanceLevel used for WCAG criterias,guidelines and principles,
 * with "AAA" being the highest priority.
 */
public enum ConformanceLevel {
    A(1),
    AA(2),
    AAA(3);

    private int priority;

    ConformanceLevel(int priority)
    {
        this.priority = priority;
    }

    /* Work in Progess

    public boolean comparateConformance(ConformanceLevel a, ConformanceLevel b)
    {
        return false;
    }
    */
}
