package de.telran.stanislavsPacage.lesson14.standartfi;

import java.util.function.Function;

public class Handler implements Function<Request, String> {

    @Override
    public String apply(Request request) {
        return String.format("Message is %s, number is %d",
                request.getMessage(),
                request.getNumber());
    }
}
