package com.example.list.arraylist;

import java.util.*;

import com.example.utils.IntegerFactory;

public class ListContainsTest {
    public static void main(String[] args) {
        List<Integer> list = IntegerFactory.createListOfIntegers();
        if (list.contains(10)) {
            System.out.println("A lista contém o elemento 10");
        }else{
            System.out.println("O elemento 10 não está na lista");
        }
    }
}
