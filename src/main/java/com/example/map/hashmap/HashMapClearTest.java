package com.example.map.hashmap;

import java.util.*;

public class HashMapClearTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "One");
        map.put("2", "Two");
        map.put("3", "Three");

        System.out.println("Map before clear: " + map);

        map.clear();

        System.out.println("Map after clear: " + map);

    }
}
