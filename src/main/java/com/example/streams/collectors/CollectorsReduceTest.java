package com.example.streams.collectors;

import java.util.*;
import java.util.stream.Collectors;

import com.example.utils.Person;
import com.example.utils.PersonFactory;

public class CollectorsReduceTest {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(5, 10, 15);
        Optional<Integer> sum = numeros.stream().collect(Collectors.reducing(Integer::sum));
        System.out.println(sum.orElse(0));

        int sum2 = numeros.stream().collect(Collectors.reducing(0, Integer::sum));
        System.out.println(sum2);

        List<Person> peoples = PersonFactory.createPersonList();

        int sum3 = peoples.stream().collect(Collectors.reducing(0, Person::getAge, Integer::sum));
        System.out.println(sum3);
    }
}
