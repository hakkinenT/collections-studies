package com.example.map.hashmap;

import java.util.*;

public class HashMapValuesTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        
        List<Integer> list = map.values().stream().map(v -> v).toList();
        System.out.println(list);

        List<Integer> list2 = map.values().stream().map(v -> v * 2).toList();
        System.out.println(list2);
    }
}
