package com.example.list.arraylist;

import java.util.*;

import com.example.utils.IntegerFactory;

public class ListRemoveTest {
    public static void main(String[] args) {
        List<Integer> list = IntegerFactory.createOrderedListOfIntegers();
        System.out.println("Lista original: " + list);
        System.out.println();
        System.out.println("Lista depois de remover o elemento no indice 9: " + list.get(9));
        list.remove(9);
        System.out.println(list);

        System.out.println();
        System.out.println("Lista depois de remover o elemento 16: ");
        list.remove(Integer.valueOf(16));
        System.out.println(list);
    }
}
