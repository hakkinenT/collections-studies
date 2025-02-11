package com.example.map.hashmap;

import java.util.*;

public class HashMapMergeTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        System.out.println("Original map: " );
        System.out.println(map);

        System.out.println();

        System.out.println("Usando o método merge() para atualizar o valor de 'A'");
        map.merge("A", 10, (oldVal, newVal) -> oldVal + newVal);

        System.out.println("Como a chave 'D' não existe, o método merge() irá inserí-la");
        map.merge("D", 10, (oldVal, newVal) -> oldVal + newVal);

        System.out.println();
        System.out.println("Updated Map: ");
        System.out.println(map);

    }
}
