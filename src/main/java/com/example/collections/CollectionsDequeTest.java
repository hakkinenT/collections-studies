package com.example.collections;

import java.util.*;

public class CollectionsDequeTest {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(5);

        //! TEM O MESMO COMPORTAMENTO DE UMA FILA
        System.out.println("Deque: ");
        System.out.println(deque);
        System.out.println("Add element 10 in deque: ");
        deque.add(10);
        System.out.println(deque);

        //! PASSA A SER UMA FILA COM O MESMO COMPORTAMENTO DE UMA PILHA
        Queue<Integer> nq = Collections.asLifoQueue(deque);
        System.out.println("Queue: ");
        System.out.println(nq);
        System.out.println("Add element 30 in queue: ");
        nq.add(30);
        System.out.println(nq);
    }
}
