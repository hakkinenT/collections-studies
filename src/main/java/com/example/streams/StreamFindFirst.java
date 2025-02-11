package com.example.streams;

import java.util.*;

import com.example.utils.Person;
import com.example.utils.PersonFactory;

public class StreamFindFirst {
    public static void main(String[] args) {
        List<Person> personList = PersonFactory.createPersonList();
        Optional<Person> firstPerson = personList.stream().findFirst();
        if (firstPerson.isPresent()) {
            System.out.println("Person: " + firstPerson);
        } else {
            System.out.println("Ninguem encontrado");
        }
    }
    
}
