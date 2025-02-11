package com.example.list.arraylist;

import java.util.*;
import java.util.function.UnaryOperator;

import com.example.utils.IntegerFactory;



public class ListReplaceAllTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,-1,2,3,-1,4,5,-1));
        System.out.println("Lista original: " + list);
        //! replaceAll em List é diferente do replaceAll em Collections
        list.replaceAll(n -> n * (-1));
        System.out.println();
        System.out.println("Lista modificada: " + list);

        System.out.println();
        List<String> words = new ArrayList<>(List.of("azul", "gato", "pano", "chuveiro"));
        System.out.println("Lista original: " + words);
        words.replaceAll(String::toUpperCase);
        System.out.println("Lista modificada: " + words);

        System.out.println();
        List<String> phrases = new ArrayList<>(List.of(" A ", " Lua ", " já ", " nasceu "));
        System.out.println("Lista original: " + phrases);
        phrases.replaceAll(String::trim);
        System.out.println("Lista modificada: " + phrases);

        System.out.println();
        List<Integer> list2 = IntegerFactory.createOrderedListOfIntegers();
        System.out.println("Lista original: " + list2);
        list2.replaceAll(new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer num){
                return num + 5;
            }
        });
        System.out.println("Lista modificada: " + list2);
    }
}
