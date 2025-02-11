package com.example.collections;

import java.util.*;

public class CollectionsEnumerationTest {
    public static void main(String[] args) {
        //! PODE SER USADO PARA LIDAR COM API LEGADA
        List<String> colors = new ArrayList<>(List.of("azul", "branco", "preto", "amarelo"));
        Enumeration<String> e = Collections.enumeration(colors);
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
