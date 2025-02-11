package com.example.list.linkedlist;

import java.util.*;
public class LinkedListGetFirstTest {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Mango");
        linkedList.add("Orange");

        String firstFruit = linkedList.getFirst();
        System.out.println("First fruit: " + firstFruit);
    }
}
