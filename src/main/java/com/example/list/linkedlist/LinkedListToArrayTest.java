package com.example.list.linkedlist;

import java.util.*;

public class LinkedListToArrayTest {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("java");
        list.add("csharp");
        list.add("python");

        String arr1[] = list.toArray(new String[0]);
        for (String string : arr1) {
            System.out.println(string);
        }

        System.out.println();
        System.out.println("Tamanho do array maior do que a lista: ");
        //! Tamanho do array maior do que a lista
        String arr2[] = list.toArray(new String[5]);
        for (String string : arr2) {
            System.out.println(string);
        }
    }
}
