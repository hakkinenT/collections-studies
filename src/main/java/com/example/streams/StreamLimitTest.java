package com.example.streams;

import java.util.stream.Stream;

public class StreamLimitTest {
    public static void main(String[] args) {
        //! O método limit define a quantidade de items na stream
        Stream.generate(Math::random)
                .limit(15)
                .forEach(System.out::println);
    }
}
