package com.example.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsRotateTest {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(1,2,3,4,5,6));
        Collections.rotate(list1, 2);
        System.out.println("List rotated: " + list1);

        Integer arr[] = {7,8,9,10,11,12}; //! não funciona com array de tipos primitivos
        Collections.rotate(Arrays.asList(arr), 2);
        System.out.println("Array rotated: " + Arrays.toString(arr));

        Double arr2[] = {1.0, 2.0, 3.5, 12.3};
        Collections.rotate(Arrays.asList(arr2), 2);
        System.out.println("Array rotated: " + Arrays.toString(arr2));
    }
}
