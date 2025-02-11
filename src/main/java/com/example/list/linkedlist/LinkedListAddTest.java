package com.example.list.linkedlist;

import java.util.*;

public class LinkedListAddTest {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("Lista: ");
        System.out.println(list);

        list.add(1, "D");
        System.out.println();
        System.out.println("Lista depois de adicionado o elemento D no indice 1: ");
        System.out.println(list);
    }
}
