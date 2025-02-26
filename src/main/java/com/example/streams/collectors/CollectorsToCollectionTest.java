package com.example.streams.collectors;

import java.util.*;
import java.util.stream.Collectors;

import com.example.utils.Person;
import com.example.utils.PersonFactory;

public class CollectorsToCollectionTest {
    public static void main(String[] args) {
        List<Person> peoples = PersonFactory.createPersonList();
        Deque<String> names = peoples.stream().map(Person::getName).collect(Collectors.toCollection(ArrayDeque::new));
        System.out.println(names.peek());
    }
}
