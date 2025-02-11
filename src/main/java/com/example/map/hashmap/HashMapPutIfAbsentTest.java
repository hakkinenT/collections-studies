package com.example.map.hashmap;

import java.util.*;

public class HashMapPutIfAbsentTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", null);

        System.out.println("Map original: ");
        System.out.println(map);
        System.out.println();

        //! Insere uma novo registro (chave-valor) se a chave não existe:
        //! Atualiza o valor de uma chave já existente, mas que está associada ao valor null
        //! Não realiza nenhuma alteração caso a chave já exista e esteja associada com um valor diferente de null
        map.putIfAbsent("A", 3);
        map.putIfAbsent("D", 4);
        map.putIfAbsent("E", 5);

        System.out.println("Updated map: ");
        System.out.println(map);
    }
}
