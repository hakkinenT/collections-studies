package com.example.streams;

import java.util.*;
import java.util.stream.Stream;

import com.example.utils.Person;
import com.example.utils.PersonFactory;

public class StreamReduceTest {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("GFG", "Geeks", "for", "GeeksQuiz", "GeeksForGeeks"));
        //! encontrar a maior string
        Optional<String> longestString = words.stream().reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2);
        if (longestString.isPresent()) {
            System.out.println(longestString.get());
        }

        //! combinar strings
        String arr[] = {"Geeks", "for", "Geeks"};
        Optional<String> combinedString = Arrays.stream(arr).reduce((str1, str2) -> str1 + " - " + str2);
        if (combinedString.isPresent()) {
            System.out.println(combinedString.get());
        }

        //! somar todos os números
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        int sum = nums.stream().reduce(0, (elem1, elem2) -> elem1 + elem2);
        System.out.println(sum);
        
        Stream<Integer> data = Stream.iterate(10, i -> i <= 100, i -> i * 2);
        int computedData = data.parallel().reduce(0, (a, b) -> a + b, Integer::sum);
        System.out.println(computedData);

        //! somar todas as idades das pessoas
        List<Person> personList = PersonFactory.createPersonList();
        int sumAges = personList.stream().reduce(0, (e, p) -> e + p.getAge(), Integer::sum);
        System.out.println(sumAges);
    }
}
