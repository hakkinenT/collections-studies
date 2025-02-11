package com.example.map.treemap;

import java.util.*;

public class TreeMapCeilingKeyTest {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("F", 5);

        //! Retorna a chave C, já que esta existe no map
        System.out.println(map.ceilingKey("C"));

        //! Retorna uma chave maior que E, já que E não existe no map
        System.out.println(map.ceilingKey("E"));
    }
    
}
