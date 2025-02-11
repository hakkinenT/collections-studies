package com.example.utils;

import java.util.ArrayList;
import java.util.List;

public class PersonFactory {
    public static Person createPerson(){
        return new Person("José", 30, 1.67, 99.0);
    }

    public static List<Person> createPersonList(){
        
        Person p1 = new Person("José", 30, 1.67, 99.0);
        Person p2 = new Person("Carla", 33, 1.60, 55.0);
        Person p3 = new Person("Lúcio", 22, 1.70, 70.0);
        Person p4 = new Person("Cláudia", 20, 1.62, 60.0);
        Person p5 = new Person("Marcelo", 44, 1.75, 100.0);
        Person p6 = new Person("José", 60, 1.63, 99.0);

        return new ArrayList<>(List.of(p1, p2, p3, p4, p5, p6));
    }
}
