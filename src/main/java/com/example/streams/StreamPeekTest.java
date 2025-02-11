package com.example.streams;

import java.util.stream.Stream;

public class StreamPeekTest {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9,10);
        stream.peek(System.out::println).forEach(x -> {});
    }
}
