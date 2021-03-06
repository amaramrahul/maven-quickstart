package com.example.project.snippets;

import java.util.*;

public class DisjointSet<T> {
    private final Map<T, T> parents = new HashMap<>();
    private final Map<T, Integer> sizes = new HashMap<>();
    private final Map<T, Integer> ranks = new HashMap<>();

    public void makeSet(T x) {
        if (!parents.containsKey(x)) {
            parents.put(x, x);
            sizes.put(x, 1);
            ranks.put(x, 0);
        }
    }

    public T find(T x) {
        if (!x.equals(parents.get(x))) {
            parents.put(x, find(parents.get(x)));
            return parents.get(x);
        } else {
            return x;
        }
    }

    public void unionBySize(T x, T y) {
        T rootX = find(x);
        T rootY = find(y);

        if (rootX.equals(rootY)) {
            return;
        }

        if (sizes.get(rootX) < sizes.get(rootY)) {
            parents.put(rootX, rootY);
            sizes.put(rootY, sizes.get(rootX) + sizes.get(rootY));
            sizes.remove(rootX);
        } else {
            parents.put(rootY, rootX);
            sizes.put(rootX, sizes.get(rootX) + sizes.get(rootY));
            sizes.remove(rootY);
        }
    }

    public void unionByRank(T x, T y) {
        T rootX = find(x);
        T rootY = find(y);

        if (rootX.equals(rootY)) {
            return;
        }

        if (ranks.get(rootX).equals(ranks.get(rootY))) {
            ranks.put(rootX, ranks.get(rootX)+1);
            parents.put(rootY, rootX);
            ranks.remove(rootY);
        } else if (ranks.get(rootX) < ranks.get(rootY)) {
            parents.put(rootX, rootY);
            ranks.remove(rootX);
        } else {
            parents.put(rootY, rootX);
            ranks.remove(rootY);
        }
    }
}