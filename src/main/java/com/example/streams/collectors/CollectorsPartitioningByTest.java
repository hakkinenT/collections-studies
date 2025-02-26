package com.example.streams.collectors;

import java.util.*;
import java.util.stream.Collectors;

import com.example.utils.Person;
import com.example.utils.PersonFactory;

public class CollectorsPartitioningByTest {
    public static void main(String[] args) {
        List<Person> peoples = PersonFactory.createPersonList();
        Map<Boolean, List<Person>> pe = peoples.stream().collect(Collectors.partitioningBy(p -> p.getHeight() > 1.60));
        System.out.println(pe);

        List<Person> peoples2 = List.of(
            new Person("Ana", 17, 1.57, 45.0),
            new Person("Bruno", 25, 1.67, 75.0),
            new Person("Carlos", 16, 1.68, 85.0)
        );

        System.out.println();
        //! Conta quantas pessoas são maiores e menores de idade
        Map<Boolean, Long> countByAge = peoples2
                                            .stream()
                                            .collect(
                                                Collectors.partitioningBy(
                                                    p -> p.getAge() >= 18, 
                                                    Collectors.counting()));
        System.out.println(countByAge);                                                    
    }
}
