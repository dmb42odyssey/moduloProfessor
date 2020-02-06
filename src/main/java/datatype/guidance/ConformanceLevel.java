package datatype.guidance;

// A: Low priority
// AAA: Highest priority

public enum ConformanceLevel {
    A(1),
    AA(2),
    AAA(3);

    private int priority;

    ConformanceLevel(int priority)
    {
        this.priority = priority;
    }

    public boolean comparateConformance(ConformanceLevel a, ConformanceLevel b)
    {
        return false;
    }
}
