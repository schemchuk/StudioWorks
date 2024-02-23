package de.telran.sammary.lesson;

import javax.xml.catalog.CatalogFeatures;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableFeatureTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask[] futureTask = new FutureTask[5];

        for (int i = 0; i < 5; i++) {
            Callable callable = new CallableExample();
            futureTask[i] = new FutureTask<>(callable);

            Thread thread = new Thread(futureTask[i]);
            thread.start();
            System.out.println(thread.getName());
            System.out.println(futureTask[i].get());
        }
    }

    
}
