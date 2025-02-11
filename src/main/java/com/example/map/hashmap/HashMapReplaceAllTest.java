package com.example.map.hashmap;

import java.util.*;

public class HashMapReplaceAllTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", null);
        System.out.println("Map original: ");
        System.out.println(map);

        System.out.println();
        //! Substitui o valor de cada chave pelo resultado da função 
        System.out.println("Chamando o método replaceAll() para substituir os valores pelo seu dobro...");
        System.out.println("Caso o valor seja 'null', será substituido por 1");
        map.replaceAll((key, val) -> val != null ? val * 2 : 1);
        
        System.out.println();
        System.out.println("Map atualizado: ");
        System.out.println(map);
    }
}
