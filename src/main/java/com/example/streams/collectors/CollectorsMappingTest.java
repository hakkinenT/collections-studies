package com.example.streams.collectors;

import java.util.*;
import java.util.stream.Collectors;

import com.example.utils.Person;
import com.example.utils.PersonFactory;

public class CollectorsMappingTest {
    public static void main(String[] args) {
        List<Person> peoples = PersonFactory.createPersonList();
        Set<String> namesInUpperCase = peoples.stream()
                                        .collect(
                                            Collectors.mapping(
                                                p -> p.getName().toUpperCase(), 
                                                Collectors.toSet()
                                            )
                                        );
        System.out.println(namesInUpperCase);
    }
}
