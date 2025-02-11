package com.example.map.treemap;

import java.util.*;

public class TreeMapCeilingEntryTest {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("F", 5);

        //! Retorna o registro (chave-valor) associado com a chave C, já que esta existe no map
        System.out.println(map.ceilingEntry("C"));

        //! Retorna o registro (chave-valor) associado com uma chave MAIOR que E, já que E não existe no map
        System.out.println(map.ceilingEntry("E"));
    }
    
}
