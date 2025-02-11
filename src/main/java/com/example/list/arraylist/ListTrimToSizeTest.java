package com.example.list.arraylist;

import java.util.*;


public class ListTrimToSizeTest {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(20); // Capacidade inicial de 20
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println("Capacidade inicial grande: criada com espaço extra.");

        // Ajustando a capacidade ao tamanho atual
        numbers.trimToSize();

        System.out.println("Capacidade ajustada ao tamanho atual dos elementos.");
    }
}
