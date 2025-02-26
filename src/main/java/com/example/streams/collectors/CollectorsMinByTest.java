package com.example.streams.collectors;

import java.util.*;
import java.util.stream.Collectors;

import com.example.utils.Person;
import com.example.utils.PersonFactory;

public class CollectorsMinByTest {
    public static void main(String[] args) {
        List<Person> peoples = PersonFactory.createPersonList();
        Optional<Person> jungePerson = peoples.stream().collect(Collectors.minBy(Comparator.comparing(Person::getAge)));
        if (jungePerson.isPresent()) {
            System.out.println(jungePerson.get());
        }
    }
}
