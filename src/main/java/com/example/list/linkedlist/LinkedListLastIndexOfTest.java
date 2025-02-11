package com.example.list.linkedlist;

import java.util.*;


public class LinkedListLastIndexOfTest {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Mango");
        linkedList.add("Orange");
        linkedList.add("Mango");
        System.out.println("Último indice do elemento 'Mango': " + linkedList.lastIndexOf("Mango"));
    }
}
