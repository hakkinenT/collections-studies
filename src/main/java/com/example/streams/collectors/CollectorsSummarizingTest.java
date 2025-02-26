package com.example.streams.collectors;

import java.util.*;
import java.util.stream.Collectors;

import com.example.utils.Person;
import com.example.utils.PersonFactory;

public class CollectorsSummarizingTest {
    public static void main(String[] args) {
        List<Person> peoples = PersonFactory.createPersonList();
        DoubleSummaryStatistics dStatistics = peoples.stream().collect(Collectors.summarizingDouble(Person::getHeight));
        System.out.println("Soma de todas as alturas = " + dStatistics.getSum());
        System.out.println("Média de todas as alturas = " + dStatistics.getAverage());
        System.out.println("Total de alturas cadastradas = " + dStatistics.getCount());
        System.out.println("Maior altura = " + dStatistics.getMax());
        System.out.println("Menor altura = " + dStatistics.getMin());

        System.out.println();
        IntSummaryStatistics iStatistics = peoples.stream().collect(Collectors.summarizingInt(Person::getAge));
        System.out.println("Soma de todas as idades = " + iStatistics.getSum());
        System.out.println("Média de todas as idades = " + iStatistics.getAverage());
        System.out.println("Total de idades cadastradas = " + iStatistics.getCount());
        System.out.println("Maior idade = " + iStatistics.getMax());
        System.out.println("Menor idade = " + iStatistics.getMin());
    }
}
