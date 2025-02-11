package com.example.map.hashmap;

import java.util.*;

public class HashMapComputeIfAbsentTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1) ;
        map.put("B", 2);

        //! Se a chave já existe, nada será feito. Caso contrário, um novo registro (key-value) será inserido
        int i = map.computeIfAbsent("A", key -> key.length() + 3);
        int j = map.computeIfAbsent("C", key -> key.length());

        System.out.println("Valor de C: " + j);
        System.out.println("Valor de A: " + i);

        System.out.println("Map atualizado: ");
        System.out.println(map);


    }
}
