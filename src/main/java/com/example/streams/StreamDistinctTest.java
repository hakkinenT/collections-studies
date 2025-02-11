package com.example.streams;

import java.util.*;

import com.example.utils.Person;
import com.example.utils.PersonFactory;

public class StreamDistinctTest {
    public static void main(String[] args) {
        List<Person> personList = PersonFactory.createPersonList();
        List<String> distinctNames = personList.stream().map(Person::getName).distinct().toList();
        System.out.println(distinctNames);        
    }
}
