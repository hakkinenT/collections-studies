package com.example.list.linkedlist;

import java.util.*;

public class LinkedListAddAllTest {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.addAll(Arrays.asList("A", "B", "C"));
        System.out.println("Lista: ");
        System.out.println(list);

        list.addAll(1, Arrays.asList("D", "E", "F"));
        System.out.println();
        System.out.println("Lista depois de adicionado os elementos D, E, F a partir do indice 1: ");
        System.out.println(list);
    }
}
