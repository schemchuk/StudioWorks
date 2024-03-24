package de.telran.stanislavsPacage.lesson10.queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queueExample {
    public static void main(String[] args) {
        int time = 100;
        Queue<Integer> queue = new LinkedList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        for (int i = 0; i < time; i++) {
            queue.add(i);
        }
            while (!queue.isEmpty()){
                queue.poll();
                System.out.println(queue);

            }
        System.out.println("----------------------------");
        System.out.println(queue);

        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(3);
        priorityQueue.offer(22);

        for (int i : priorityQueue) {
            System.out.println(i);
        }
        }

    }

