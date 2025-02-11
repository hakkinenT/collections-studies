package com.example.map.treemap;

import java.util.*;

public class TreeMapLastKeyTest {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("F", 5);

        //! Retorna a última chave do map
        System.out.println(map.lastKey());
    }
}
