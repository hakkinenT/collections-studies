package com.example.stack;

import java.util.*;

public class StackPushTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("apple");
        stack.push("banana");
        stack.push("mango");
        
        System.out.println("Stack: " + stack);
    }
}
