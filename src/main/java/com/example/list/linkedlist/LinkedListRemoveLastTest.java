package com.example.list.linkedlist;

import java.util.*;
public class LinkedListRemoveLastTest {
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
        
        //! Remove a cauda da lista
        String fruit = linkedList.removeLast();
        System.out.println("Último elemento removido: " + fruit);

        System.out.println("Lista depois do método removeLast(): " + linkedList);

        System.out.println();
        boolean isRemoved = linkedList.removeLastOccurrence("Orange");
        System.out.println("Última ocorrência do elemento 'Orange' removida: " + isRemoved);

        System.out.println("Lista depois do método removeLastOccurrence('Orange'): " + linkedList);


    }
}
