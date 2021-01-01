package com.example.project.snippets;

import java.util.Objects;

class Triplet<A, B, C> {
    private final A first;
    private final B second;
    private final C third;

    public Triplet(A first, B second, C third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    private A getFirst() {
        return first;
    }

    private B getSecond() {
        return second;
    }

    private C getThird() {
        return third;
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second, third);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Triplet))
            return false;
        Triplet<?, ?, ?> triplet = (Triplet<?, ?, ?>) o;
        return Objects.equals(first, triplet.first) && Objects.equals(second, triplet.second)
                && Objects.equals(third, triplet.third);
    }
}
