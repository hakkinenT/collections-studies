package com.example.list.linkedlist;

import java.util.*;
public class LinkedListPeekTest {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Mango");
        linkedList.add("Orange");

        System.out.println("Lista original: " + linkedList);
        System.out.println();
        
        //! Obtém a cabeça (head) da lista, mas não remove
        String fruit = linkedList.peek();
        System.out.println("Head da lista: " + fruit);

        System.out.println("Lista depois do método peek(): " + linkedList);

        System.out.println();
        fruit = linkedList.peekFirst();
        System.out.println("Head da lista: " + fruit);

        System.out.println("Lista depois do método peekFirst(): " + linkedList);

        System.out.println();
        fruit = linkedList.peekLast();
        System.out.println("Tail da lista: " + fruit);

        System.out.println("Lista depois do método peekLast(): " + linkedList);
    }
}
