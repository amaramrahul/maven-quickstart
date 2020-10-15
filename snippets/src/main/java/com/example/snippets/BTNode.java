package com.example.snippets;

import java.util.Objects;

class BTNode<T> {
    T data;
    BTNode<T> left;
    BTNode<T> right;

    BTNode(T data, BTNode<T> left, BTNode<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
