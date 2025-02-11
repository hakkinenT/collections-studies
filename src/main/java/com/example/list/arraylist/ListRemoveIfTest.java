package com.example.list.arraylist;

import java.util.*;
import java.util.function.Predicate;

public class ListRemoveIfTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        System.out.println("Lista original: " + list);
        list.removeIf(n -> n % 2 != 0);
        System.out.println("Lista após o método removeIf: " + list);

        list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10)); 
        Predicate<Integer> even = n -> n % 2 == 0;
        list.removeIf(even);
        System.out.println("Lista após o método removeIf: " + list);
    }
}
