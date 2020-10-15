package com.example.snippets;

import java.util.Objects;

class SLLNode<T> {
    T data;
    SLLNode<T> next;

    SLLNode(T data, SLLNode<T> next) {
        this.data = data;
        this.next = next;
    }
}
