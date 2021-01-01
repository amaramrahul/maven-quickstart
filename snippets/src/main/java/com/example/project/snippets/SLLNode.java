package com.example.project.snippets;

class SLLNode<T> {
    private final T data;
    public SLLNode<T> next;

    public SLLNode(T data, SLLNode<T> next) {
        this.data = data;
        this.next = next;
    }

    public SLLNode(T data) {
        this(data, null);
    }

    public T getData() {
        return data;
    }
}
