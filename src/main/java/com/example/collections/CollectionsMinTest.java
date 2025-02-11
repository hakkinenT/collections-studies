package com.example.collections;

import java.util.*;

import com.example.utils.Person;
import com.example.utils.PersonFactory;

public class CollectionsMinTest {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(1,2,3, 10, 100, 400, 10000));
        System.out.println(Collections.min(list1));

        List<Person> listPerson = PersonFactory.createPersonList();
        Comparator<Person> comparator = new Comparator<Person>() {
            public int compare(Person p1, Person p2){
                return p1.getAge().compareTo(p2.getAge());
            }
        };

        Person person = Collections.min(listPerson, comparator);
        System.out.println(person.toString());
    }

    
}

