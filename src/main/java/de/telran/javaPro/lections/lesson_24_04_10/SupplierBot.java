package de.telran.javaPro.lections.lesson_24_04_10;

import java.util.function.Supplier;

public class SupplierBot {

    static class Bot {
        private String name;

        public Bot(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Bot{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {

        Supplier<Bot> generateBot = () -> new Bot("bot1");
        System.out.println(generateBot.get());

        System.out.println("------------------------");

    }


}
