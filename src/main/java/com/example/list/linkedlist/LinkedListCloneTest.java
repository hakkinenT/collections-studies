package com.example.list.linkedlist;

import java.util.*;


public class LinkedListCloneTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("Lista original: " + list);
        System.out.println("Clonando a lista...");
        System.out.println();
        @SuppressWarnings("unchecked")
        LinkedList<String> list2 = (LinkedList<String>)list.clone();
        System.out.println("Lista clonada: " + list2);
        
    }
}
