package com.example.map.hashmap;

import java.util.*;

public class HashMapComputeIfPresentTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1) ;
        map.put("B", 2);

        //! Se a chave JÁ existe, será feita uma 'computação' com o valor, se este NÃO FOR nulo
        //! Caso contrário, nada será feito
        map.computeIfPresent("A", (key, val) -> val + 3);
        map.computeIfPresent("C", (key, val) -> val + 2);

        
        System.out.println("Map atualizado: ");
        System.out.println(map);


    }
}
