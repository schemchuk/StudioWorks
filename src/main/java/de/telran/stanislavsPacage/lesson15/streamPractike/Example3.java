package de.telran.stanislavsPacage.lesson15.streamPractike;

import java.util.function.Function;

public class Example3 {
    public static void main(String[] args) {
        Function<String,String> function1 = s -> s +" One ";
        Function<String,String> function2 = s -> s +" Two ";
        Function<String,String> function3 = s -> s +" Three ";
        Function<String,String> function4 = s -> s +" Four ";

        System.out.println(
                function1
                        .andThen(function2)
                        .compose(function3)
                        .compose(function4)
                        .apply(" -> Compose ")
        );
    }
}
