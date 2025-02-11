package com.example.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapEntrySetTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        System.out.println("Obtendo o Set por meio do entrySet() method: ");
        System.out.println(map.entrySet());

        System.out.println();
        System.out.println("Iterando sobre o Map usando o método entrySet()");
        for (Map.Entry<String, Integer> elem : map.entrySet()) {
            System.out.println("{ Key = " + elem.getKey() + ", Value = " + elem.getValue() + " }");
        }
    }
}
