package com.example.streams;

import java.util.stream.Stream;

public class StreamBuilderTest {
    public static void main(String[] args) {
        Stream.Builder<String> builder = Stream.builder();
        Stream<String> stream = builder.add("Ana").add("Paulo").add("Pedro").build();
        stream.forEach(System.out::println);
    }
}
