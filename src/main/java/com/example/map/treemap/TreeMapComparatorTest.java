package com.example.map.treemap;

import java.util.*;
public class TreeMapComparatorTest {
    public static void main(String[] args) {
        NavigableMap<String, Integer> map = new TreeMap<>(Comparator.reverseOrder());
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("F", 5);

        System.out.println("TreeMap: ");
        System.out.println(map);

        Comparator<? super String> comparator = map.comparator();
        System.out.println("Comparator: " + comparator);
    }
}
