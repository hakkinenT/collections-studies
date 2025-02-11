package com.example.list.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDescendingIteratorTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        
        
        Iterator<String> it = list.descendingIterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
