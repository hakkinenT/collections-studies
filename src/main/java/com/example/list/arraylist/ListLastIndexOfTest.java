package com.example.list.arraylist;

import java.util.*;

import com.example.utils.IntegerFactory;
public class ListLastIndexOfTest {
    public static void main(String[] args) {
        List<Integer> list = IntegerFactory.createListOfIntegers();
        System.out.println(list.lastIndexOf(10));
    }
}
