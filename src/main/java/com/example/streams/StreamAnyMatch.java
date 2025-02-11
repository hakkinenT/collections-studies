package com.example.streams;

import java.util.*;

import com.example.utils.Person;
import com.example.utils.PersonFactory;

public class StreamAnyMatch {
    public static void main(String[] args) {
        List<Person> personList = PersonFactory.createPersonList();
        boolean result = personList.stream().anyMatch(p -> p.getName().equals("José"));
        System.out.println("Existe algum José na lista? " + result);
    }
}
