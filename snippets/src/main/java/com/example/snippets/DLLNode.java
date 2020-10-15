package com.example.snippets;

import java.util.Objects;

class DLLNode<T> {
    T data;
    DLLNode<T> prev;
    DLLNode<T> next;

    DLLNode(T data, DLLNode<T> prev, DLLNode<T> next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
