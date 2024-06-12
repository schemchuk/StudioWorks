package de.telran.javaPro.practicWithAlex.lesson_24_06_12;


import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.Callable;

public class Cafe {

    public static class Meal {
        private String title;
        private int type;
        private double price;

        public Meal(String title, int type, double price) {
            this.title = title;
            this.type = type;
            this.price = price;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Meal{" +
                    "title='" + title + '\'' +
                    ", type=" + type +
                    ", price=" + price +
                    '}';
        }

        public class TotalAmountTaxes implements Callable<Double> {
            private Cafe.Meal[] meals;

            public TotalAmountTaxes(Cafe.Meal[] meals) {
                this.meals = meals;
            }

            @Override
            public Double call() throws Exception {
                Double totalTaxes = 0.0;
                for (Cafe.Meal meal: meals) {
                    totalTaxes += meal.getPrice() * 0.45;
                }

                return totalTaxes;
            }
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        Meal[] meals = new Meal[100];
        for (int i = 0; i < 100; i++) {
            meals[i] = new Meal("meal" + i, random.nextInt(1, 3), 10 + (100 - 10) * random.nextDouble());
        }


        Arrays.stream(meals).forEach(System.out::println);

//        FutureTask<String> future = new FutureTask<>(new TotalAmountTaxes(meals));
//        new Thread(future).start();
//        System.out.println(future.get());
    }
}
