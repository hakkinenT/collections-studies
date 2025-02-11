package com.example.collections;

import java.util.*;

public class CollectionsIndexOfSublistTest {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(1,2,3,4,5,6,4,5,6));
        List<Integer> list2 = new ArrayList<>(List.of(4,5,6));
        System.out.println("Posição da primeira ocorrência da sublist " + list2 +": " + Collections.indexOfSubList(list1, list2));
        System.out.println("Posição da última ocorrência da sublist " + list2 +": " + Collections.lastIndexOfSubList(list1, list2));
    }
}
