package com.example.map.hashmap;

import java.util.*;

public class HashMapReplaceTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", null);
        System.out.println("Original map: " );
        System.out.println(map);
        System.out.println();

        System.out.println("Método replace(key, newValue)");
        System.out.println("-------------------------------");
        //! Atualiza o valor da chave, se esta estiver presente no map
        //! Caso a chave especificada não esteja no map, nenhuma alteração será realizada
        System.out.println("map.replace(\"A\", 5)");
        System.out.println("map.replace(\"D\", 10)");
        System.out.println("map.replace(\"E\", 15)");
        map.replace("A", 5);
        map.replace("D", 10);
        map.replace("E", 15);
        System.out.println();
        System.out.println("Update map: ");
        System.out.println(map);

        //! Atualiza o valor da chave, se oldValue especificado corresponder com o valor atual da chave
        //! Caso o oldValue não corresponda ao valor atual, nenhuma alteração será realizada
        //! Caso a chave especificada não esteja no map, nenhuma alteração será realizada
        System.out.println();
        System.out.println("Método replace(key, newValue, oldValue)");
        System.out.println("-------------------------------");
        System.out.println("map.replace(\"A\", 1, 15)");
        System.out.println("map.replace(\"B\", 2, 15)");
        System.out.println("map.replace(\"E\", 1, 10)");
        map.replace("A", 1, 15);
        map.replace("B", 2, 15);
        map.replace("E", 1, 10);

        System.out.println();
        System.out.println("Update map: ");
        System.out.println(map);

    }
}
