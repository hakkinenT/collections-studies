package com.example.collections;

import java.util.*;

public class CollectionsNewSetFromMapTest {
    public static void main(String[] args) {
        Map<String, Boolean> map = new HashMap<>();

        Set<String> set = Collections.newSetFromMap(map);
        set.add("ana");
        set.add("marcia");
        set.add("carla");
        System.out.println(map);
        System.out.println(set);
    }
}
