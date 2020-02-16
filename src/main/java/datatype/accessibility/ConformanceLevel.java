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

    public ConformanceLevel lowerConformance(ConformanceLevel conformanceLevel)
    {
        switch (conformanceLevel)
        {
            case AAA:
                return AA;
            case AA:
                return A;
            default:
                return null;
        }
    }

    /*
    public boolean comparateConformance(ConformanceLevel a, ConformanceLevel b)
    {
        return false;
    }

     */
}
