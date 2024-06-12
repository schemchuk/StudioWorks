package de.telran.javaPro.practicWithAlex.lesson_24_06_03;

public class Task implements Runnable{
    int start;
    int end;
    int primeCount;
    public Task(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + " начал работу");
        for (int i = start; i <end ; i++) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                System.out.println("Thread " + Thread.currentThread().getName() + " разбужен и прерван, i = " + i);
                return;
            }

            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
                if (isPrime) {
                    primeCount++;

                    if (Thread.interrupted()) {
                        System.out.println("Thread " + Thread.currentThread().getName() + " заканчивает работу по сигналу, i = " + i);
                        return;
                    }
                }
            }
        }
    }
}
