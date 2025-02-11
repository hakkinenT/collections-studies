package com.example.list.arraylist;

import java.util.*;

import com.example.utils.IntegerFactory;

public class ListContainsAllTest {
    public static void main(String[] args) {
        List<Integer> list = IntegerFactory.createListOfIntegers();
        if (list.containsAll(Arrays.asList(100, 200, 300))) {
            System.out.println("A lista contém os elementos 100, 200, 300");
        }else{
            System.out.println("Os elementos 100, 200, 300 não estão na lista");
        }
    }
}
