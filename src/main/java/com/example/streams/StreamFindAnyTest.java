package com.example.streams;

import java.util.*;

import com.example.utils.Person;
import com.example.utils.PersonFactory;

public class StreamFindAnyTest {
    public static void main(String[] args) {
        List<Person> personList = PersonFactory.createPersonList();
        Optional<Person> anyPerson = personList.stream().findAny();
        if (anyPerson.isPresent()) {
            System.out.println("Person: " + anyPerson);
        } else {
            System.out.println("Ninguem encontrado");
        }
    }
    
}
