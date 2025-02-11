package com.example.list.arraylist;

import java.util.*;

import com.example.utils.IntegerFactory;

public class ListRemoveAllTest {
    public static void main(String[] args) {
        List<Integer> list = IntegerFactory.createOrderedListOfIntegers();
        System.out.println("Lista original: " + list);
        System.out.println();
        System.out.println("Lista depois de remover os elementos 1,5,11,15: ");
        list.removeAll(Arrays.asList(1, 5, 11, 15));
        System.out.println(list);
    }
}
