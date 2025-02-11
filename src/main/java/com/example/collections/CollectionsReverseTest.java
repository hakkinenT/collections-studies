package com.example.collections;


import java.util.*;

public class CollectionsReverseTest {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(1,2,3,4,5,6));
        System.out.println(list1);
        Collections.reverse(list1);
        System.out.println("Lista invertida: " + list1);
    }
}
