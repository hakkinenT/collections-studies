package com.example.list.linkedlist;

import java.util.*;

public class LinkedListElementTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println("List: " + list);

        //! Obtém o primeiro elemento da lista, mas não remove
        String head = list.element();

        System.out.println("Head: " + head);

        System.out.println("List: " + list);
    }
}
