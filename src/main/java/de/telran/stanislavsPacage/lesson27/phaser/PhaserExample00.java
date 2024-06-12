package de.telran.stanislavsPacage.lesson27.phaser;


import java.util.concurrent.Phaser;

public class PhaserExample00 {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        // начинаем с 1 - чтобы зарегистрировать только основной поток, а он уже
        // в свою очередь будет ожидать регистрацию других потоков

        // Создадим и запустим потоки


        MyRunnable[] runnables = new MyRunnable[3];
        for (int i = 0; i < 3; i++) {
            runnables[i] = new MyRunnable(phaser);
            Thread thread = new Thread(runnables[i]);
            thread.start();
        }
        phaser.arriveAndDeregister();
        System.out.println("Все фазы завершены. Программа завершила работу");
    }

    static class MyRunnable implements Runnable {
        private final Phaser phaser;
        
        MyRunnable(Phaser phaser) {
            this.phaser = phaser;
        }

        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                // Действие при достижении конца фазы
                System.out.println("Фаза " + (i +1) + " выполнена вля потока " + Thread.currentThread().getName());
                // ожидание достижения конца фазы
                phaser.arriveAndAwaitAdvance();
            }

            // отказ от регистрации в фазере
            phaser.arriveAndDeregister();
        }
    }
}
