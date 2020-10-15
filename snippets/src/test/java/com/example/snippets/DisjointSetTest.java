package com.example.snippets;

import static org.testng.Assert.*;
import org.testng.annotations.*;

public class DisjointSetTest {
    @Test
    public void testUnionBySize() {
        DisjointSet<Character> ds = new DisjointSet<>();
        ds.makeSet('a');
        ds.makeSet('b');
        ds.makeSet('c');
        ds.makeSet('d');
        ds.makeSet('e');
        ds.makeSet('f');
        ds.makeSet('g');
        ds.makeSet('h');
        ds.makeSet('i');
        ds.makeSet('j');

        ds.unionBySize('a', 'b');
        ds.unionBySize('b', 'd');
        ds.unionBySize('c', 'f');
        ds.unionBySize('c', 'i');
        ds.unionBySize('j', 'e');
        ds.unionBySize('g', 'j');

        assertEquals(ds.find('a').charValue(), 'a');
        assertEquals(ds.find('b').charValue(), 'a');
        assertEquals(ds.find('c').charValue(), 'c');
        assertEquals(ds.find('d').charValue(), 'a');
        assertEquals(ds.find('e').charValue(), 'j');
        assertEquals(ds.find('f').charValue(), 'c');
        assertEquals(ds.find('g').charValue(), 'j');
        assertEquals(ds.find('h').charValue(), 'h');
        assertEquals(ds.find('i').charValue(), 'c');
        assertEquals(ds.find('j').charValue(), 'j');
    }
}