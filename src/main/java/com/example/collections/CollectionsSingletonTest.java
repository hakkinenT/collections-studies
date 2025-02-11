package com.example.collections;

import java.util.*;

public class CollectionsSingletonTest {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(List.of("azul", "amarelo", "verde", "amarelo", "lilás", "rosa", "amarelo"));
        Set<String> set = Collections.singleton("amarelo");
        
        System.out.println("Lista antes de remover os elementos 'amarelo': " + colors);
        colors.removeAll(set);
        System.out.println("Lista depois de remover os elementos 'amarelo': " + colors);
    }
}
