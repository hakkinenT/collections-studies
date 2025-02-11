package com.example.streams;

import java.util.stream.Stream;

public class StreamOfTest {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,6,7,8,9);
        stream1.forEach(System.out::println);

        System.out.println();
        Stream<String> stream2 = Stream.of("azul");
        stream2.forEach(System.out::println);
    }
}
