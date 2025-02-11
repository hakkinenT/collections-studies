package com.example.streams;

import java.util.List;
import java.util.Optional;

import com.example.utils.Person;
import com.example.utils.PersonFactory;

public class StreamMinMaxTest {
    public static void main(String[] args) {
        List<Person> personList = PersonFactory.createPersonList();
        Optional<Person> minAge = personList.stream().min((p1,p2) -> p1.getAge().compareTo(p2.getAge()));
        if (minAge.isPresent()) {
            System.out.println("Menor idade: " + minAge.get());
        }

        Optional<Person> maxAge = personList.stream().max((p1, p2) -> p1.getAge().compareTo(p2.getAge()));
        if (maxAge.isPresent()) {
            System.out.println("Maior idade: " + maxAge.get());
        }
    }
}
