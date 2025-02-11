package com.example.list.arraylist;

import java.util.*;

import com.example.utils.IntegerFactory;

public class ArrayListCloneTest {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = IntegerFactory.createOrderedArrayListOfIntegers();
        @SuppressWarnings("unchecked")
        ArrayList<Integer> list2 = (ArrayList<Integer>)list1.clone();
        System.out.println(list2);
        
    }
}
