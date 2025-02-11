package com.example.stack;

import java.util.Stack;

public class StackEmptyTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
        }    
    }
}
