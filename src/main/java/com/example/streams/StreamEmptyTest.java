package com.example.streams;

import java.util.Iterator;
import java.util.stream.Stream;

public class StreamEmptyTest {
    public static void main(String[] args) {
        Stream<String> stream = Stream.empty();
        Iterator<String> it = stream.iterator();
        if (!it.hasNext()) {
            System.out.println("A stream está vazia");
        }
    }
}
