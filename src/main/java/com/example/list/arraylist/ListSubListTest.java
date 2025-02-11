package com.example.list.arraylist;

import java.util.*;

import com.example.utils.IntegerFactory;

public class ListSubListTest {
    public static void main(String[] args) {
        List<Integer> list = IntegerFactory.createOrderedListOfIntegers();
        System.out.println("Lista original: " + list);
        System.out.println();
        List<Integer> sublistOfList = list.subList(5, 10);
        System.out.println("Sublista do index 5 até o 9: " + sublistOfList);
    }
}
