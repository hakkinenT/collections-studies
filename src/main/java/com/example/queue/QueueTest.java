package com.example.queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println("Queue com LinkedList");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        System.out.println();
        System.out.println("Queue com ArrayDeque");
        Queue<Integer> queue2 = new ArrayDeque<>(5);
        System.out.println("Testando com o método add");
        try {
            queue2.add(1);
            queue2.add(2);
            queue2.add(3);
            queue2.add(4);
            queue2.add(5);
            queue2.add(6);
        } catch (IllegalStateException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        System.out.println(queue2);

        System.out.println();
        Queue<Integer> queue3 = new ArrayDeque<>();
        System.out.println("Testando com o método offer");
        int i = 0;
        while (i <= 5) {
            System.out.println("Value: " + i + "-" + "Inserido? " + queue3.offer(i));
            i++;
            
        }
    }
}
