package com.example.streams;

import java.util.*;

public class StreamSkipTest {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        List<Integer> result = nums.stream().skip(10).toList();
        System.out.println(result);
    }
}
