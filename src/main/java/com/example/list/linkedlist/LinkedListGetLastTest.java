package com.example.list.linkedlist;

import java.util.*;
public class LinkedListGetLastTest {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Mango");
        linkedList.add("Orange");

        String lastFruit = linkedList.getLast();
        System.out.println("Last fruit: " + lastFruit);
    }
}
