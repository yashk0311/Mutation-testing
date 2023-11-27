package dsa.algorithms;

public class Pair<A, B> {

    private final A a;
    private final B b;

    public Pair(A a, B b) {
        this.a = a;
        this.b = b;
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        Pair pair = (Pair) o;

        if (!a.equals(pair.a)) return false;
        if (!b.equals(pair.b)) return false;

        return true;
    }
}