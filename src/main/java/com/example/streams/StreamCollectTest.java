package com.example.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.example.utils.Person;
import com.example.utils.PersonFactory;

import java.util.*;

public class StreamCollectTest {
    public static void main(String[] args) {
        Stream.Builder<String> builder = Stream.builder();
        Stream<String> stream = builder.add("Ana").add("Paulo").add("Pedro").build();
        //List<String> list = stream.collect(Collectors.toList());
        //System.out.println(list);
        System.out.println();
        List<String> list1 = stream.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        System.out.println(list1);

        Stream.Builder<String> builder2 = Stream.builder();
        Stream<String> stream2 = builder2
                                    .add("O ")
                                    .add("amor ")
                                    .add("é ")
                                    .add("uma ")
                                    .add("dor ")
                                    .add("é ")
                                    .add("um ")
                                    .add("tédio ")
                                    .add("sem ")
                                    .add("remédio")
                                    .build();
        String concat = stream2.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
        System.out.println(concat);

        System.out.println();
        System.out.println("Collectors groupingBy method");
        List<Person> personList = PersonFactory.createPersonList();
        Map<Double, List<Person>> peopleByHeight = personList.stream().collect(Collectors.groupingBy(Person::getHeight));
        peopleByHeight.forEach((k,v) -> System.out.println(k + ": " + v));

        System.out.println();
        Map<Integer, Map<Double, List<Person>>> peopleByAgeAndHeight = personList.stream().collect(Collectors.groupingBy(Person::getAge, Collectors.groupingBy(Person::getHeight)));
        peopleByAgeAndHeight.forEach((k,v) -> System.out.println(k + ": " + v));
    }
}
