package com.example.streams;

import java.util.List;

import com.example.utils.Person;
import com.example.utils.PersonFactory;

public class StreamNoneMatchTest {
    public static void main(String[] args) {
        List<Person> personList = PersonFactory.createPersonList();
        boolean result = personList.stream().noneMatch(p -> p.getHeight() >= 2.0);
        System.out.println(result);
    }
}
