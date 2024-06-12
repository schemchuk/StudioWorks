package de.telran.stanislavsPacage.lesson27.Calable;

import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<Integer> callableTask = () -> {
            Thread.sleep(2000);
            return 42;
        };

        Future<Integer> future = executorService.submit(callableTask);
        System.out.println(" Ждем результат ...");

        // блокируем поток до получения результата

        Integer result = future.get();

        System.out.println("Результат: " + result);

        executorService.shutdown();



    }
}
