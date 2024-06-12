package de.telran.stanislavsPacage.lesson27.collection;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {
    public static void main(String[] args) {
        // создаем блокирующую очередь с лимитом в три элемента
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);

        // создаем и запускаем производителя товаров

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Producer добавляет товар " + i);
                try {
                    queue.put(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        producer.start();

        // создаем и запускаем покупателя

        Thread consumer = new Thread(() -> {
            boolean flag = true;
            while (flag) {
                Integer element = null;
                try {
                    element = queue.take();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Consumer покупает товар: " + element);
                try {
                    Thread.sleep(2000);

                    if (queue.size() == 0){
                        flag = false;
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        consumer.start();
    }
}
