package com.example.list.arraylist;

import java.util.*;

import com.example.utils.IntegerFactory;

public class ListSetTest {
    public static void main(String[] args) {
        List<Integer> list = IntegerFactory.createOrderedListOfIntegers();
        System.out.println("Lista original: " + list);
        list.set(5, 100);
        System.out.println();
        System.out.println("Substituindo o elemento 6 pelo elemento 100...");
        System.out.println("Lista atualizada: " + list);
    }
}
