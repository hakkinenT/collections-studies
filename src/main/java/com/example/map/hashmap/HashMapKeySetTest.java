package com.example.map.hashmap;

import java.util.*;

public class HashMapKeySetTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        System.out.println("Retornando um Set com as chaves usando o método keySet()");
        Set<String> keySet = map.keySet();
        System.out.println(keySet);
    }
}
