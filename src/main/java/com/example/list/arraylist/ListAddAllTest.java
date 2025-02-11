package com.example.list.arraylist;

import java.util.*;

import com.example.utils.IntegerFactory;

public class ListAddAllTest {
    public static void main(String[] args) {
        List<Integer> list = IntegerFactory.createOrderedListOfIntegers();
        System.out.println("Lista original: " + list);
        System.out.println("Tamanho: " + list.size());
        
        System.out.println();
        System.out.println("Lista depois de inserir os valores 100, 200, 300, 400: ");
        list.addAll(Arrays.asList(100,200,300,400));
        System.out.println(list);
        System.out.println("Tamanho: " + list.size());

        System.out.println();
        System.out.println("Lista depois de inserir os valores 500, 600, 700, 800 na posição 5: ");
        list.addAll(5, Arrays.asList(500,600,700,800));
        System.out.println(list);
        System.out.println("Tamanho: " + list.size());
    }
}
