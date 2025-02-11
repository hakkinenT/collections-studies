package com.example.list.linkedlist;

import java.util.*;

public class LinkedListContainsTest {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        
        if (list.contains("A")) {
            System.out.println("A está na lista");
        } else {
            System.out.println("A não está na lista");
            
        }
    }
}
