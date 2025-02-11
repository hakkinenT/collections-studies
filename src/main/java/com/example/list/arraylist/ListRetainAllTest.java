package com.example.list.arraylist;

import java.util.*;

public class ListRetainAllTest {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(1,2,3,4,5));
        List<Integer> list2 = new ArrayList<>(List.of(2,4));
        System.out.println("Lista original: " + list1);
        System.out.println("Lista contendo os elementos que devem continuar no lista chamada: " + list2);
        boolean modified = list1.retainAll(list2);
        System.out.println("Collection modificada: " + modified);
        System.out.println("Lista original (Com os elementos mantidos): " + list1);
    }
}
