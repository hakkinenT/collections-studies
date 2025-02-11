package com.example.map.hashmap;

import java.util.*;

public class HashMapGetTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        System.out.println("Obtendo valor da chave 'A' usando o método get(): ");
        System.out.println("A = " + map.get("A"));
    }
}
