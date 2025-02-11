package com.example.list.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListAddLastTest {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("Lista inicial: ");
        System.out.println(list);

        list.addLast("A1");
        System.out.println();
        System.out.println("Lista depois que o elemento A1 foi adicionado na última posição: ");
        System.out.println(list);
    }
}
