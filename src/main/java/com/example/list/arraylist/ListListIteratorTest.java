package com.example.list.arraylist;

import java.util.*;

import com.example.utils.IntegerFactory;
public class ListListIteratorTest {
    public static void main(String[] args) {
        List<Integer> list = IntegerFactory.createListOfIntegers();
        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println();
        System.out.println("listIterator a partir do index 10");
        ListIterator<Integer> it2 = list.listIterator(10);
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
    }
}
