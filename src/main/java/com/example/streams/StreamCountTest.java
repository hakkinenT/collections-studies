package com.example.streams;


import com.example.utils.Person;
import com.example.utils.PersonFactory;

import java.util.*;

public class StreamCountTest {
    public static void main(String[] args) {
        List<Person> personList = PersonFactory.createPersonList();    
        System.out.println(personList.stream().count());    
    }
}
