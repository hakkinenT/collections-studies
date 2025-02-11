package com.example.list.arraylist;

import java.util.*;

public class ListSpliteratorTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Pen", "Paper", "Rubber", "Pencil"));
        Spliterator<String> spliterator = list.spliterator();
        System.out.println("A lista contém: ");
        while (spliterator.tryAdvance(elem -> System.out.print(elem + " ")));

        //! Diferentemente do Iterator, o Spliterator suporta programação paralela
    }
}
