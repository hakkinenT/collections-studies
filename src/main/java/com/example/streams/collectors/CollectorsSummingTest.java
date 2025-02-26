package com.example.streams.collectors;

import java.util.*;
import java.util.stream.Collectors;

import com.example.utils.Person;
import com.example.utils.PersonFactory;

public class CollectorsSummingTest {
    public static void main(String[] args) {
        List<Person> peoples = PersonFactory.createPersonList();
        double totalHeight = peoples.stream().collect(Collectors.summingDouble(Person::getHeight));
        System.out.println(totalHeight);

        int totalAge = peoples.stream().collect(Collectors.summingInt(Person::getAge));
        System.out.println(totalAge);
    }
}
