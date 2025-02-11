package com.example.list.arraylist;

import java.util.*;

import com.example.utils.IntegerFactory;

public class ListAddTest {
    public static void main(String[] args) {
        List<Integer> list = IntegerFactory.createOrderedListOfIntegers();
        System.out.println("Lista original: " + list);
        System.out.println("Tamanho: " + list.size());
        
        System.out.println();
        System.out.println("Lista depois de inserir o valor 100: ");
        list.add(100);
        System.out.println(list);
        System.out.println("Tamanho: " + list.size());

        System.out.println();
        System.out.println("Lista depois de inserir o valor 1000 na posição 5: ");
        list.add(5, 1000);
        System.out.println(list);
        System.out.println("Tamanho: " + list.size());
    }
}
