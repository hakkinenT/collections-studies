package com.example.map.hashmap;

import java.util.*;

public class HashMapRemoveTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        System.out.println("Original map: ");
        System.out.println(map);

        System.out.println();
        System.out.println("Removendo o registro com chave 'B' usando o remove('B')...");
        Integer removedValue = map.remove("B");
        System.out.println("Valor da chave 'B' = " + removedValue);

        System.out.println();
        System.out.println("Updated map: ");
        System.out.println(map);

        System.out.println();
        System.out.print("Usando o método remove('C', 5) para ");
        System.out.println("remover o registro com a chave C se o valor for 5");
        boolean isConditionFound = map.remove("C", 5);
        System.out.println("Registro encontrado? " + isConditionFound);

        System.out.println();
        System.out.println("Updated map: ");
        System.out.println(map);

        System.out.println();
        System.out.print("Usando o método remove('C', 3) para ");
        System.out.println("remover o registro com a chave C se o valor for 3");
        isConditionFound = map.remove("C", 3);
        System.out.println("Registro encontrado? " + isConditionFound);

        System.out.println();
        System.out.println("Updated map: ");
        System.out.println(map);

    }
}
