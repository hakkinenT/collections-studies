package com.example.list.linkedlist;

import java.util.*;

public class LinkedListClearTest {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("Lista anted o método clear(): ");
        System.out.println(list);

        list.clear();
        System.out.println();
        System.out.println("Lista depois do método clear(): ");
        System.out.println(list);
    }
}
