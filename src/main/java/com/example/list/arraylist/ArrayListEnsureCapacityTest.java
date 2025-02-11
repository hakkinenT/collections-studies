package com.example.list.arraylist;

import java.util.*;

import com.example.utils.IntegerFactory;
public class ArrayListEnsureCapacityTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = IntegerFactory.createOrderedArrayListOfIntegers();
        list.ensureCapacity(25);
        list.addAll(Arrays.asList(30,40,50,60,70,80,90,100));
        System.out.println(list);
        
    }
}
