package com.example.map.treemap;

import java.util.*;

public class TreeMapTailMapTest {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("F", 5);

        NavigableMap<String, Integer> nmap = map.tailMap("C", false);
        System.out.println(nmap);

        SortedMap<String, Integer> smap = map.tailMap("C");
        System.out.println(smap);
    }
}
