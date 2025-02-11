package com.example.collections;

import java.util.*;

public class CollectionsFrequencyTest {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(List.of("amarelo", "azul", "amarelo", "verde", "lilás"));
        System.out.println(Collections.frequency(colors, "amarelo"));
    }
}
