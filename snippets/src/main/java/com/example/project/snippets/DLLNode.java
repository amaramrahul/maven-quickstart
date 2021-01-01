package com.example.project.snippets;

class DLLNode<T> {
    private final T data;
    public DLLNode<T> prev;
    public DLLNode<T> next;

    public DLLNode(T data, DLLNode<T> prev, DLLNode<T> next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public DLLNode(T data) {
        this(data, null, null);
    }

    public T getData() {
        return data;
    }
}
