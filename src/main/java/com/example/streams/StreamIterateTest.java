package com.example.streams;

import java.util.stream.Stream;

public class StreamIterateTest {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(0, i -> i <= 10, i -> i + 2);
        stream.forEach(System.out::println);
    }
}
