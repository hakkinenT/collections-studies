package com.example.list.linkedlist;

import java.util.*;
public class LinkedListPopTest {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Mango");
        linkedList.add("Orange");

        System.out.println("Lista original: " + linkedList);
        System.out.println();
        
        //! Obtém a cabeça (head) e a remove da lista
        //! Se comporta como uma pilha
        String fruit = linkedList.pop();
        System.out.println("Head da lista: " + fruit);

        System.out.println("Lista depois do método pop(): " + linkedList);
    }
}
