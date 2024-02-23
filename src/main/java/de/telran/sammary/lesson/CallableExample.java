package de.telran.sammary.lesson;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableExample implements Callable {
    @Override
    public Object call() throws Exception {
        Random generator = new Random();
        int num = generator.nextInt(5);

        Thread.sleep(num * 1000);

        return num;
    };
    }

