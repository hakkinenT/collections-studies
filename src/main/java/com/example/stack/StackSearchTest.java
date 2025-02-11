package com.example.stack;

import java.util.Stack;

public class StackSearchTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");

        System.out.println("Stack: " + stack);
        System.out.println();

        int position = stack.search("C");
        System.out.println("Position of C in stack: " + position);
    }
}
