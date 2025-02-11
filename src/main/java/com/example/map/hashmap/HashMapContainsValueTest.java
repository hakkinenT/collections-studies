package com.example.map.hashmap;

import java.util.*;

public class HashMapContainsValueTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        if (map.containsValue(1)) {
            System.out.println("O valor 1 está presente");
        }

        if (!map.containsValue(10)) {
            System.out.println("Nenhum valor 10 foi encontrado");
        }
    }
}
