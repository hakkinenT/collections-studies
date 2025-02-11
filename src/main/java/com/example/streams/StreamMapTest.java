package com.example.streams;

import java.util.*;

import com.example.utils.Person;
import com.example.utils.PersonFactory;

public class StreamMapTest {
    public static void main(String[] args) {
        List<Person> personList = PersonFactory.createPersonList();
        List<String> names = personList.stream().map(p -> p.getName().toUpperCase()).toList();
        System.out.println("Lista dos nomes mapeados para letras maiúsculas: ");
        System.out.println(names);

        System.out.println();
        int ages = personList.stream().mapToInt(p -> p.getAge()).sum();
        System.out.println("Somatório de todas as idades: " + ages);

        System.out.println();
        System.out.println("Calculando média de alturas: ");
        
        System.out.println();
        System.out.println("Opção 1 - usando average(): ");
        OptionalDouble heightAvg = personList.stream().mapToDouble(Person::getHeight).average();
        System.out.println("Média das alturas: " + heightAvg.getAsDouble());

        System.out.println();
        System.out.println("Opção 2 - usando summaryStatistics()");
        DoubleSummaryStatistics heightAvgStatistics = personList.stream().mapToDouble(Person::getHeight).summaryStatistics();
        System.out.println("Média das alturas: " + heightAvgStatistics.getAverage());

        System.out.println();
        System.out.println("Opção 3 - usando reduce()");
        double heightAvg2 = personList
                                .stream()
                                .mapToDouble(Person::getHeight)
                                .reduce(0.0, (sum, element) -> (sum + element)) / personList.size();
        
        System.out.println("Média das alturas: " + heightAvg2);

    }
}
