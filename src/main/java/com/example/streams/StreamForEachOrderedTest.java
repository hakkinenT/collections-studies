package com.example.streams;

import java.util.List;

import com.example.utils.Person;
import com.example.utils.PersonFactory;

public class StreamForEachOrderedTest {
    public static void main(String[] args) {
        List<Person> personList = PersonFactory.createPersonList();
        personList.stream().forEachOrdered(System.out::println);
    }
}
