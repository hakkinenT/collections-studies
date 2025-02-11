package com.example.map.hashmap;

import java.util.*;

public class HashMapComputeTest {
    public static void main(String[] args) {
        System.out.println("String map");
        System.out.println("-------------------------------");
        Map<String, String> map = new HashMap<>();
        map.put("Name", "João");
        map.put("Address", "Rua José");

        System.out.println("Map before compute() method: ");
        System.out.println(map);

        map.compute("Name", (key, val) -> val.concat(" Pereira de Araújo"));
        map.compute("Address", (key, val) -> val.concat(" da Costa Tomáz"));

        System.out.println();
        System.out.println("Map after compute() method: ");
        System.out.println(map);

        System.out.println();
        System.out.println("Integer map");
        System.out.println("-------------------------------");
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("k1", 15);
        map2.put("k2", 20);

        System.out.println("Map before compute() method: ");
        System.out.println(map2);

        map2.compute("k1", (key, val) -> val == null ? 1 : val + 1);
        map2.compute("k2", (key, val) -> val == null ? 1 : val + 1);

        System.out.println();
        System.out.println("Map after compute() method: ");
        System.out.println(map2);

        System.out.println();
        System.out.println("Throws NullPointerException when key is null");
        System.out.println("-------------------------------");
        
        try {
            map2.compute(null, (key, val) -> val + 1);

            System.out.println(map2);
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e);
        }
    }
}
