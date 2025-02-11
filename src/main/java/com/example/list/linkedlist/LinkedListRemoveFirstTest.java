package com.example.list.linkedlist;

import java.util.*;
public class LinkedListRemoveFirstTest {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Mango");
        linkedList.add("Orange");
        linkedList.add("Pinapple");
        linkedList.add("Strawberry");
        linkedList.add("Orange");
        linkedList.add("Mango");

        System.out.println("Lista original: " + linkedList);
        System.out.println();
        
        //! Remove a cabeça da lista
        String fruit = linkedList.removeFirst();
        System.out.println("Primeiro elemento removido: " + fruit);

        System.out.println("Lista depois do método removeFirst(): " + linkedList);

        System.out.println();
        boolean isRemoved = linkedList.removeFirstOccurrence("Mango");
        System.out.println("Primeira ocorrência do elemento 'Mango' removida: " + isRemoved);

        System.out.println("Lista depois do método removeFirstOccurrence('Mango'): " + linkedList);


    }
}
