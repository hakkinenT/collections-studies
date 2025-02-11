package com.example.collections;

import java.util.*;

public class CollectionsReverseOrderTest {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(1,2,3,4,5,6));
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println(list1);
    }
}
