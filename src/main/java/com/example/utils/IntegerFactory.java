package com.example.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IntegerFactory {
    private static List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,10,11,12,13,14,15,16,17,18,19,20));
    
    public static List<Integer> createOrderedListOfIntegers(){
        return list;
    }

    public static List<Integer> createListOfIntegers(){
        Collections.shuffle(list);
        return list;
    }

    public static ArrayList<Integer> createOrderedArrayListOfIntegers(){
        return new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
    }
}
