package com.example.list.linkedlist;

import java.util.*;
public class LinkedListPollTest {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Mango");
        linkedList.add("Orange");

        System.out.println("Lista original: " + linkedList);
        System.out.println();
        
        //! Obtém a cabeça (head) e a remove da lista
        String fruit = linkedList.poll();
        System.out.println("Head da lista: " + fruit);

        System.out.println("Lista depois do método poll(): " + linkedList);

        System.out.println();
        fruit = linkedList.pollFirst();
        System.out.println("Head da lista: " + fruit);

        System.out.println("Lista depois do método pollFirst(): " + linkedList);

        System.out.println();
        fruit = linkedList.pollLast();
        System.out.println("Tail da lista: " + fruit);

        System.out.println("Lista depois do método pollLast(): " + linkedList);
    }
}
