package com.example.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsReplaceAllTest {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(1,2,3,4,5,6,4,5,6));
        System.out.println(Collections.replaceAll(list1, 4, -2));
        System.out.println(list1);
    }
}
