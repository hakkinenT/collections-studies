package com.example.streams.collectors;

import java.util.*;
import java.util.stream.Collectors;

import com.example.utils.Person;
import com.example.utils.PersonFactory;

public class CollectorsJoiningTest {
    public static void main(String[] args) {
        List<Person> peoples = PersonFactory.createPersonList();
        String concatedNames1 = peoples.stream().map(Person::getName).collect(Collectors.joining());
        System.out.println(concatedNames1);

        String concatedNames2 = peoples.stream().map(Person::getName).collect(Collectors.joining(", "));
        System.out.println(concatedNames2);

        String concatedNames3 = peoples.stream().map(Person::getName).collect(Collectors.joining(", ", "[ ", " ]"));
        System.out.println(concatedNames3);
    }
}
