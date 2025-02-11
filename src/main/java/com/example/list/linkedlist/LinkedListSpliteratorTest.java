package com.example.list.linkedlist;

import java.util.*;

public class LinkedListSpliteratorTest {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Mango");
        linkedList.add("Orange");

        Spliterator<String> spliterator = linkedList.spliterator();
        System.out.println("A lista contém: ");
        while (spliterator.tryAdvance(System.out::println));

        //! Diferentemente do Iterator, o Spliterator suporta programação paralela
    }
}
