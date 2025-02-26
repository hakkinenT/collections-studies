package com.example.streams.collectors;

import java.util.*;
import java.util.stream.Collectors;

import com.example.utils.Person;
import com.example.utils.PersonFactory;

public class CollectorsMaxByTest {
    public static void main(String[] args) {
        List<Person> peoples = PersonFactory.createPersonList();
        Optional<Person> oldestPerson = peoples.stream().collect(
                                        Collectors.maxBy(
                                            Comparator.comparing(Person::getAge)));
        if (oldestPerson.isPresent()) {
            System.out.println(oldestPerson.get());
        }
    }
}
