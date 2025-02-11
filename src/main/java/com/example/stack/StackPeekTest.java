package com.example.stack;

import java.util.*;

public class StackPeekTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("apple");
        stack.push("banana");
        stack.push("mango");

        //! Não remove o elemento, apenas retorna o elemento do topo
        String element = stack.peek();
        System.out.println("Peeked Element: " + element);
        System.out.println("Updated Stack: " + stack);
    }
}
