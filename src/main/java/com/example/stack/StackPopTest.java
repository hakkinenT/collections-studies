package com.example.stack;

import java.util.*;

public class StackPopTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("apple");
        stack.push("banana");
        stack.push("mango");

        String element = stack.pop();
        System.out.println("Removed Element: " + element);
        System.out.println("Updated Stack: " + stack);
    }
}
