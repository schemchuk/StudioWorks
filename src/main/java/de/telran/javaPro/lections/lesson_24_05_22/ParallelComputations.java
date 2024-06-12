package de.telran.javaPro.lections.lesson_24_05_22;

public class ParallelComputations {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());

        long start = System.currentTimeMillis();
        // Thread1 2 ---- 33_000
        // Thread2 33_000 ---- 66_000
        // Thread3 66_000 ---- 100_000
        Task task1 = new Task(2, 500_000);
        Task task2 = new Task(500_000, 800_000);
        Task task3 = new Task(800_000, 1_000_000);
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);
        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int count = task1.primeCount + task2.primeCount + task3.primeCount;
        long end = System.currentTimeMillis();
        System.out.println("Total numbers of prime: " + count);
        System.out.println("Time elapsed: " + (end - start) + ", ms");
    }

    static class Task implements Runnable {

        int start;
        int end;
        int primeCount;

        public Task(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            for (int i = start; i < end; i++) {
                boolean isPrime = true;

                for (int j=2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime)
                    primeCount++;
            }
        }
    }

}
