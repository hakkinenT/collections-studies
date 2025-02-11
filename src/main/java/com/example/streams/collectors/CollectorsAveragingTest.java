package com.example.streams.collectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsAveragingTest {
    public static void main(String[] args) {
        Stream<Double> sDouble = Stream.of(1.2, 2.4, 5.6, 10.0);
        double avgDouble = sDouble.collect(Collectors.averagingDouble(m -> Double.valueOf(m)));
        System.out.println(avgDouble);

        Stream<Integer> sInt = Stream.of(1,2,3,4,5);
        double avgInt = sInt.collect(Collectors.averagingInt(m -> Integer.valueOf(m)));
        System.out.println(avgInt);

        Stream<Long> sLong = Stream.of(1L, 2L, 3L, 4L, 5L);
        double avgLong = sLong.collect(Collectors.averagingLong(m -> Long.valueOf(m)));
        System.out.println(avgLong);

        Stream<String> sString = Stream.of("1", "2", "3", "4", "5");
        double avgString = sString.collect(Collectors.averagingDouble(m -> Double.parseDouble(m)));
        System.out.println(avgString);
    }
}
