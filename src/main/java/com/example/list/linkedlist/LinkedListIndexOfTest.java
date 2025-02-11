package com.example.list.linkedlist;

import java.util.*;


public class LinkedListIndexOfTest {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Mango");
        linkedList.add("Orange");
        System.out.println("Indice do elemento 'Mango': " + linkedList.indexOf("Mango"));
    }
}
