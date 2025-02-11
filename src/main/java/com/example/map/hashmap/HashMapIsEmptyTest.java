package com.example.map.hashmap;

import java.util.*;

public class HashMapIsEmptyTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        if (map.isEmpty()) {
            System.out.println("O map está vazio");
        }else{
            System.out.println("O map contém " + map.size() + " registros");
        }

        System.out.println();
        System.out.println("Chamando o método clear()...");

        map.clear();

        if (map.isEmpty()) {
            System.out.println("O map está vazio");
        }else{
            System.out.println("O map contém " + map.size() + " registros");
        }
    }
}
