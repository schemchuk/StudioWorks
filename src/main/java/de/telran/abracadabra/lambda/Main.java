package de.telran.abracadabra.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        /**
         *  Создать Supplier randomJoke, который выдает пользователю случайный анекдот из заготовленного исходного списка анекдотов.
         */

        Map<Integer, String> jokesMap = new HashMap<>();
        jokesMap.put(1, "Joke1");
        jokesMap.put(2, "Joke2");
        jokesMap.put(3, "Joke3");
        jokesMap.put(4, "Joke4");
        jokesMap.put(5, "Joke5");
        jokesMap.put(6, "Joke1");


        Supplier<String> randomJoke = () -> {
            Random random = new Random();
            Integer[] keys = jokesMap.keySet().toArray(new Integer[0]);

            int randomIndex = random.nextInt(keys.length);
            Integer randomKey = keys[randomIndex];

            return jokesMap.get(randomKey);
        };
        //String joke = String.valueOf(randomJoke.get());
        String joke = randomJoke.get();
        System.out.println("Anecdote of the day in our prison: " + joke);
    }
}
