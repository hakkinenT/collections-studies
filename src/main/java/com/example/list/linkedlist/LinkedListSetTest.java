package com.example.list.linkedlist;

import java.util.*;


public class LinkedListSetTest {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Mango");
        linkedList.add("Orange");
        
        System.out.println("Lista original: " + linkedList);
        linkedList.set(2, "Pineapple");
        System.out.println();
        System.out.println("Substituindo o elemento Mango pelo elemento Pineapple...");
        System.out.println("Lista atualizada: " + linkedList);
    }
}
