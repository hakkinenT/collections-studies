package com.example.streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamIntermediateOperationsTest {
    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(
            Arrays.asList("Reflection", "Collection", "Stream"),
            Arrays.asList("Structure", "State", "Flow"),
            Arrays.asList("Sorting", "Mapping", "Reduction", "Stream")
        );

        //! flat significa achatar
        Set<String> intermediateResults = new HashSet<>();
        List<String> result = listOfLists.stream()
                                .flatMap(List::stream)
                                .filter(s -> s.startsWith("S"))
                                .map(String::toUpperCase)
                                .distinct()
                                .sorted()
                                .peek(s -> intermediateResults.add(s))
                                .collect(Collectors.toList());

        System.out.println("Intermediate results: ");
        intermediateResults.forEach(System.out::println);
        System.out.println();
        System.out.println("Final result: ");
        result.forEach(System.out::println);
        
    }
}
