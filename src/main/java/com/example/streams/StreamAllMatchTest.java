package com.example.streams;

import java.util.*;

import com.example.utils.Person;
import com.example.utils.PersonFactory;

public class StreamAllMatchTest {
    public static void main(String[] args) {
        List<Person> personList = PersonFactory.createPersonList();
        boolean result = personList.stream().allMatch(p -> p.getName().equals("José"));
        System.out.println("Todas as pessoas são josé? " + result);
    }
}
