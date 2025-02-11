package com.example.streams;

import java.util.*;
import java.util.stream.*;

import com.example.utils.Person;
import com.example.utils.PersonFactory;

public class StreamToArrayTest {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        Object arr[] = stream.toArray();
        System.out.println(Arrays.toString(arr));

        

        List<Person> personList = PersonFactory.createPersonList();
        Person persons[] = personList.stream().toArray(Person[]::new);
        System.out.println(Arrays.toString(persons));


        int ages[] = personList.stream().mapToInt(Person::getAge).toArray();
        System.out.println(Arrays.toString(ages));

        double heights[] = personList.stream().mapToDouble(Person::getHeight).toArray();
        System.out.println(Arrays.toString(heights));


    }
}
