package com.example.map.treemap;

import java.util.*;

public class TreeMapPollFirstEntryTest {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("F", 5);

        System.out.println("Map original: ");
        System.out.println(map);
        
        System.out.println();
        
        System.out.println("Retirando o primeiro registro: ");
        System.out.println("Registro desenfileirado: " + map.pollFirstEntry());
        
        System.out.println();
        
        System.out.println("Updated map: ");
        System.out.println(map);

    }
}
