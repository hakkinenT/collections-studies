package com.example.map.treemap;

import java.util.*;

public class TreeMapFloorKeyTest {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("A", 1);
        map.put("C", 3);
        map.put("D", 4);
        map.put("F", 5);

        //! Retorna a chave A, já que esta existe no map
        System.out.println(map.floorKey("A"));

        //! Retorna uma chave MENOR que B, já que B não existe no map
        System.out.println(map.floorKey("B"));

        //! Retorna uma chave MENOR que E, já que E não existe no map
        System.out.println(map.floorKey("E"));

    }
}
