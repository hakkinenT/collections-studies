package com.example.list.linkedlist;

import java.util.*;
public class LinkedListRemoveTest {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Mango");
        linkedList.add("Orange");
        linkedList.add("Pinapple");
        linkedList.add("Strawberry");
        linkedList.add("Grapes");

        System.out.println("Lista original: " + linkedList);
        System.out.println();
        
        //! Remove a cabeça da lista
        String fruit = linkedList.remove();
        System.out.println("Elemento removido: " + fruit);

        System.out.println("Lista depois do método remove(): " + linkedList);

        System.out.println();
        fruit = linkedList.remove(3);
        System.out.println("Elemento removido no índice 3: " + fruit);
        System.out.println("Lista depois do método remove(3): " + linkedList);

        System.out.println();
        boolean isRemoved = linkedList.remove("Mango");
        System.out.println("Elemento 'Mango' removido: " + isRemoved);

        System.out.println("Lista depois do método remove('Mango'): " + linkedList);


    }
}
