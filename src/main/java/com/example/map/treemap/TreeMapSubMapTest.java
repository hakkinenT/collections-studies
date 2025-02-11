package com.example.map.treemap;

import java.util.*;

public class TreeMapSubMapTest {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("F", 5);

        NavigableMap<String, Integer> nmap = map.subMap("C", true, "F", false);
        System.out.println(nmap);

        nmap = map.subMap("C", true, "F", true);
        System.out.println(nmap);

        SortedMap<String, Integer> smap = map.subMap("B", "D");
        System.out.println(smap);
    }
}
