package JavaOOPHWLesson7.ComparablePair;

public class ComparablePair<T extends Comparable<? super T>> {
    private final T o1;
    private final T o2;

    public ComparablePair(T o1, T o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    public T bigger() {
        return o1.compareTo(o2) >= 0 ? o1 : o2;
    }

    public T smaller() {
        return o1.compareTo(o2) < 0 ? o1 : o2;
    }
}