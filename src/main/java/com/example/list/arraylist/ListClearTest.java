package com.example.list.arraylist;

import java.util.*;

import com.example.utils.IntegerFactory;

public class ListClearTest {
    public static void main(String[] args) {
        List<Integer> list = IntegerFactory.createListOfIntegers();
        System.out.println("Lista original: " + list);

        System.out.println();

        System.out.println("Lista depois do clear(): ");
        list.clear();
        System.out.println(list);

    }
}
