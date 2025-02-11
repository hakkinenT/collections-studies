package com.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.example.utils.Person;
import com.example.utils.PersonFactory;

public class StreamSortedTest {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(-1,-2,-3,-4,-5,-6,-7,-8,19,110,11,132,213,9014,15,21,7,28,19,202);
        nums.stream().sorted().forEach(n -> System.out.print(n + " "));

        System.out.println();
        List<Person> personList = PersonFactory.createPersonList();
        Stream<Person> stream = personList.stream().sorted((p1,p2)->p1.getWeight().compareTo(p2.getWeight()));
        
        stream.forEach(System.out::println);
    }
}
