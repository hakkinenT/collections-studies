package com.example.collections;

import java.util.*;

public class CollectionsShuffleTest {
    public static void main(String[] args) {
        //! Shuffle significa embaralhar
        List<String> colors = new ArrayList<>(List.of("azul", "amarelo", "branco", "verde", "preto", "lilás", "rosa", "marrom", "cinza", "roxo"));
        System.out.println("Lista antes de embaralhar: " + colors);
        Collections.shuffle(colors);
        System.out.println("Lista depois de embaralhar: " + colors);

        //* Recriando lista */
        colors = new ArrayList<>(List.of("azul", "amarelo", "branco", "verde", "preto", "lilás", "rosa", "marrom", "cinza", "roxo"));
        System.out.println("Lista original: " + colors);

        //* Embaralhando a lista usando a classe Random */
        Collections.shuffle(colors, new Random());
        System.out.println("Lista embaralhada com Random(): " + colors);

        Collections.shuffle(colors, new Random(3));
        System.out.println("Lista embaralhada com Random(3): " + colors);

    }
    
}
