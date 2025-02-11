package com.example.streams;

import java.util.stream.*;

public class StreamConcatTest {
    public static void main(String[] args) {
        Stream.Builder<String> bd1 = Stream.builder();
        Stream.Builder<String> bd2 = Stream.builder();

        Stream<String> colorsStream1 = bd1.add("azul").add("amarelo").add("lilás").build();
        Stream<String> colorsStream2 = bd2.add("preto").add("branco").add("verde").build();

        Stream<String> concatedColorsStreams = Stream.concat(colorsStream1, colorsStream2);
        concatedColorsStreams.forEach(System.out::println);
    }
}
