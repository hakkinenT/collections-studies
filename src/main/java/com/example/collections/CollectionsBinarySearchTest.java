package com.example.collections;

import java.util.*;

import com.example.utils.Person;
import com.example.utils.PersonFactory;

public class CollectionsBinarySearchTest {
    public static void main(String[] args) {
        List<Person> personList = PersonFactory.createPersonList();

        Comparator<Person> comparator = new Comparator<Person>() {
            public int compare(Person p1, Person p2){
                return p1.getAge().compareTo(p2.getAge());
            }
        };

        int index = Collections.binarySearch(personList, new Person(null, 44, null, null), comparator);
        System.out.println("Found at index: " + index);
    }

    
}

