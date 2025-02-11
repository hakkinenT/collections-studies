package com.example.list.linkedlist;

import java.util.*;
public class LinkedListOfferTest {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Mango");
        linkedList.add("Orange");

        System.out.println("Lista original: " + linkedList);

        //! Adiciona um elemento no final (tail) da lista
        linkedList.offer("Pineapple");
        System.out.println("Lista depois do método offer(): " + linkedList);

        linkedList.offerFirst("Strawberry");
        System.out.println("Lista depois do método offerFirst(): " + linkedList);

        linkedList.offerLast("Grape");
        System.out.println("Lista depois do método offerLast(): " + linkedList);
    }
}
