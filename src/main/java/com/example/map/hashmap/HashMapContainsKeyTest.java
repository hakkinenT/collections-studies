package com.example.map.hashmap;

import java.util.*;

public class HashMapContainsKeyTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        if (map.containsKey("A")) {
            System.out.println("A chave 'A' está presente e seu valor é: " + map.get("A"));
        }

        if (!map.containsKey("D")) {
            System.out.println("Nenhuma chave 'D' foi encontrada");
        }
    }
}
