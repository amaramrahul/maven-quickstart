package com.example.snippets;

import java.util.HashMap;
import java.util.Map;

class TrieNode<T> {
    Map<Character, TrieNode<T>> children = new HashMap<>();
    T value;

    T find(String key) {
        TrieNode<T> node = this;
        for (Character c: key.toCharArray()) {
            if (node.children.containsKey(c)) {
                node = node.children.get(c);
            } else {
                return null;
            }
        }
        return node.value;
    }

    void insert(String key, T value) {
        TrieNode<T> node = this;
        for (Character c: key.toCharArray()) {
            node.children.putIfAbsent(c, new TrieNode<>());
            node = node.children.get(c);
        }
        node.value = value;
    }
}
