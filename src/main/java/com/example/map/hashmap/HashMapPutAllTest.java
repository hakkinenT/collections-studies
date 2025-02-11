package com.example.map.hashmap;

import java.util.*;

public class HashMapPutAllTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        System.out.println("Map 1: ");
        System.out.println(map);

        System.out.println();

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("D", 4);
        map2.put("E", 5);
        map2.put("F", 6);

        System.out.println("Map 2: ");
        System.out.println(map2);

        map.putAll(map2);

        System.out.println();
        System.out.println("Map 1 depois de inserido os elementos do Map 2 usando o método putAll()");
        System.out.println(map);
    }
}
