package com.example.list.linkedlist;

import java.util.*;
public class LinkedListPushTest {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Mango");
        linkedList.add("Orange");

        System.out.println("Lista original: " + linkedList);
        System.out.println();
        
        //! Insere um elemento no início da lista
        //! Se comporta como uma pilha
        linkedList.push("Pinapple");

        System.out.println("Lista depois do método push(): " + linkedList);
    }
}
