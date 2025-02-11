package com.example.streams.collectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsCountingTest {
    public static void main(String[] args) {
        Stream<Double> sDouble = Stream.of(1.2, 2.4, 5.6, 10.0);
        long count = sDouble.collect(Collectors.counting());
        System.out.println(count);
    }
}
