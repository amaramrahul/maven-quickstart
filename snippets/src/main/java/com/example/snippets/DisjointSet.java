package com.example.snippets;

import java.util.*;

class DisjointSet<T> {
    Map<T, T> parents = new HashMap<>();
    Map<T, Integer> sizes = new HashMap<>();
    Map<T, Integer> ranks = new HashMap<>();

    void makeSet(T x) {
        if (!parents.containsKey(x)) {
            parents.put(x, x);
            sizes.put(x, 1);
            ranks.put(x, 0);
        }
    }

    T find(T x) {
        if (!x.equals(parents.get(x))) {
            parents.put(x, find(parents.get(x)));
            return parents.get(x);
        } else {
            return x;
        }
    }

    void unionBySize(T x, T y) {
        T rootX = find(x);
        T rootY = find(y);

        if (rootX.equals(rootY)) {
            return;
        }

        if (sizes.get(rootX) < sizes.get(rootY)) {
            parents.put(rootX, rootY);
            sizes.put(rootY, sizes.get(rootX) + sizes.get(rootY));
        } else {
            parents.put(rootY, rootX);
            sizes.put(rootX, sizes.get(rootX) + sizes.get(rootY));
        }
    }

    void unionByRank(T x, T y) {
        T rootX = find(x);
        T rootY = find(y);

        if (rootX.equals(rootY)) {
            return;
        }

        if (ranks.get(rootX).equals(ranks.get(rootY))) {
            ranks.put(rootX, ranks.get(rootX)+1);
            parents.put(rootY, rootX);
        } else if (ranks.get(rootX) < ranks.get(rootY)) {
            parents.put(rootX, rootY);
        } else {
            parents.put(rootY, rootX);
        }
    }
}