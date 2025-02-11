package com.example.map.linkedhashmap;

import java.util.*;

public class LinkedHashMapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Name", "João");
        map.put("Address", "Rua José");

        System.out.println("Map criado com HashMap - não mantém ordem de inserção");
        System.out.println("    1. Name: João");
        System.out.println("    2. Address: Rua José");
        System.out.println();
        System.out.println("Map criado com HashMap -> " + map);

        Map<String, String> map2 = new LinkedHashMap<>();
        map2.put("Name", "João");
        map2.put("Address", "Rua José");

        System.out.println();
        System.out.println("Map criado com LinkedHashMap - mantém ordem de inserção");
        System.out.println("    1. Name: João");
        System.out.println("    2. Address: Rua José");
        System.out.println();
        System.out.println("Map criado com LinkedHashMap -> " + map2);

        
    }
}
