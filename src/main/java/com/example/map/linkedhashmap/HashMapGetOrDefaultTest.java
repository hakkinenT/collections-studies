package com.example.map.linkedhashmap;

import java.util.*;

public class HashMapGetOrDefaultTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        System.out.println("Actual Map: " + map);


        System.out.println();
        System.out.println("Obtendo o valor da chave 'A', caso exista, usando getOrDefault()");
        System.out.println("Retorna 0 como valor default, caso 'A' não exista");
        System.out.println("'A' existe ? " + map.containsKey("A"));
        System.out.println("'A' = " + map.getOrDefault("A", 0));
        
        System.out.println();
        System.out.println("Obtendo o valor da chave 'D', caso exista, usando getOrDefault()");
        System.out.println("Retorna 0 como valor default, caso 'D' não exista");
        System.out.println("'D' existe ? " + map.containsKey("D"));
        
        System.out.println("'D' = " + map.getOrDefault("D", 0));

        System.out.println();
        System.out.println("Actual Map: " + map);
    }
}
