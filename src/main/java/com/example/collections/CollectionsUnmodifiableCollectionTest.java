package com.example.collections;

import java.util.*;

public class CollectionsUnmodifiableCollectionTest {
    public static void main(String[] args) {
        try {
                List<Character> list = new ArrayList<>();
            list.add('X');
            list.add('Y');

            System.out.println("Lista inicial: " + list);
            Collection<Character> immutableList = Collections.unmodifiableCollection(list);
            System.out.println("Tentando modificar a unmodifiableCollection");
            immutableList.add('Z');
        } catch (UnsupportedOperationException e) { 
            System.out.println("Exception thrown : " + e); 
        } 
    }
}
