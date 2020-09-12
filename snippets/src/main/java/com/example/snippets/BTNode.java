package com.example.snippets;

import java.util.Objects;

public class BTNode<T> {
    T data;
    BTNode<T> left;
    BTNode<T> right;

    BTNode(T data, BTNode<T> left, BTNode<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, left, right);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof BTNode))
            return false;
        BTNode<?> node = (BTNode<?>) o;
        return Objects.equals(data, node.data) && Objects.equals(left, node.left)
                && Objects.equals(right, node.right);
    }
}
