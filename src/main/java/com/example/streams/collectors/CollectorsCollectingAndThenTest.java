package com.example.streams.collectors;

import java.util.stream.*;
import java.util.*;

public class CollectorsCollectingAndThenTest {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Claire", "Alice");
        
        List<String> imutableList = names.stream()
                        .distinct()
                        .collect(Collectors.collectingAndThen(
                            Collectors.toList(), 
                            Collections::unmodifiableList));

        System.out.println(imutableList);

        try {
            imutableList.add("Daniel");
        } catch (UnsupportedOperationException e) {
            System.out.println(e);
        }
    }
}
