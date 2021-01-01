package com.example.project.snippets;

class BTNode<T> {
    private final T data;
    public BTNode<T> left;
    public BTNode<T> right;

    public BTNode(T data, BTNode<T> left, BTNode<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public BTNode(T data) {
        this(data, null, null);
    }

    public T getData() {
        return data;
    }
}
