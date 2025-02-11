package com.example.map.treemap;

import java.util.*;

public class TreeMapHeadMapTest {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("F", 5);
        map.put("G", 6);
        map.put("H", 7);

        //! Retorna os registros cujas chaves são menores que a chave 'D'
        SortedMap<String, Integer> mapResult = map.headMap("D");
        System.out.println(mapResult);

        //! Retorna os registros cujas chaves são menores que a chave 'D', incluindo a chave 'D'
        SortedMap<String, Integer> mapResult2 = map.headMap("D", true);
        System.out.println(mapResult2);

    }
}
