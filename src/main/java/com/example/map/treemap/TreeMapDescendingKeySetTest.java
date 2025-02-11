package com.example.map.treemap;

import java.util.*;

public class TreeMapDescendingKeySetTest {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("F", 5);

        //! Retorna um Set com as chaves em ordem decrescente
        NavigableSet<String> keySet = map.descendingKeySet();
        System.out.println(keySet);
    }
}
