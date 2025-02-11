package com.example.streams.collectors;

import java.util.*;
import java.util.stream.Collectors;

import com.example.utils.Person;
import com.example.utils.PersonFactory;

public class CollectorsGroupingByTest {
    public static void main(String[] args) {
        System.out.println("Collectors groupingBy method");
        List<Person> personList = PersonFactory.createPersonList();
        Map<Double, List<Person>> peopleByHeight = personList
                                    .stream()
                                    .collect(Collectors.groupingBy(Person::getHeight));
        peopleByHeight.forEach((k,v) -> System.out.println(k + ": " + v));

        System.out.println();
        Map<Integer, Map<Double, List<Person>>> peopleByAgeAndHeight = personList
                                                                        .stream()
                                                                        .collect(Collectors.groupingBy(Person::getAge, Collectors.groupingBy(Person::getHeight)));
        peopleByAgeAndHeight.forEach((k,v) -> System.out.println(k + ": " + v));       
    }
}
