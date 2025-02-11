package com.example.list.linkedlist;

import java.util.*;

public class LinkedListAddFirstTest {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("Lista inicial: ");
        System.out.println(list);

        list.addFirst("A1");
        System.out.println();
        System.out.println("Lista depois que o elemento A1 foi adicionado na primeira posição: ");
        System.out.println(list);
    }
}
