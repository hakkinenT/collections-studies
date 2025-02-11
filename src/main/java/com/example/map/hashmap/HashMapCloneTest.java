package com.example.map.hashmap;

import java.util.HashMap;

public class HashMapCloneTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "One");
        map.put("2", "Two");
        map.put("3", "Three");

        System.out.println("Map original: " + map);

        @SuppressWarnings("unchecked")
        HashMap<String, String> clonedMap = (HashMap<String, String>) map.clone();
        System.out.println("Cloned map: " + clonedMap);
    }
}
