package com.example.map.treemap;

import java.util.*;

public class TreeMapFloorEntryTest {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("A", 1);
        map.put("C", 3);
        map.put("D", 4);
        map.put("F", 5);

        //! Retorna o registro (chave-valor) associado com a chave A, já que esta existe no map
        System.out.println(map.floorEntry("A"));

        //! Retorna o registro (chave-valor) associado com uma chave MENOR que B, já que B não existe no map
        System.out.println(map.floorEntry("B"));

        //! Retorna o registro (chave-valor) associado com uma chave MENOR que E, já que E não existe no map
        System.out.println(map.floorEntry("E"));

    }
}
