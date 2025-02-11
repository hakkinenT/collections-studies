package com.example.collections;

import java.time.Duration;
import java.util.*;

public class CollectionsCheckedCollectionTest {
    public static void main(String[] args) {
        
        Library library = new Library();
        List<Integer> list = new ArrayList<>(); //checked type
        Integer i1 = 3;
        Integer i2 = 4;
        list.add(i1);
        list.add(i2);
        //! Permite adicionar a lista de inteiros outros tipos de dados como String e Time
        library.addNumbers(list);
        System.out.println(list);

        //! Não permite adicionar dados de outro tipo
        try {
            List<Integer> checkedList = Collections.checkedList(list, Integer.class);
        library.addNumbers(checkedList);
        } catch (ClassCastException e) {
            System.err.println("Não é possível adicionar a lista dados de outros tipos");
        }
    }

    
}

class Library{
    @SuppressWarnings("unchecked")
    public void addNumbers(@SuppressWarnings("rawtypes") List list){ //unchecked type
        list.add("5");
        list.add(Duration.ofMinutes(6));
    }
}




