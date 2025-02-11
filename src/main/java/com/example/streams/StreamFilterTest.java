package com.example.streams;

import java.util.List;
import java.util.function.Predicate;

import com.example.utils.Person;
import com.example.utils.PersonFactory;

public class StreamFilterTest {
    public static void main(String[] args) {
        List<Person> personList = PersonFactory.createPersonList();
        Predicate<Person> lessThanOneSeventyHeight = p -> p.getHeight() < 1.70;

        List<Person> result = personList.stream().filter(lessThanOneSeventyHeight).toList();
        result.forEach(p -> System.out.println("Name: " + p.getName() + ", Idade: " + p.getAge()));
    }
}
