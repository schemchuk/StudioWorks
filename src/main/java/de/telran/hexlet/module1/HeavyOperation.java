package de.telran.hexlet.module1;

import java.util.concurrent.ThreadLocalRandom;

public class HeavyOperation {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        // Количество точек, попавших в круг
        long pointsInsideCircle = 0;
        // Общее количество точек
        long totalPoints = 1_000_000_000; // Увеличьте это число для более длительного времени выполнения

        for (long i = 0; i < totalPoints; i++) {
            double x = ThreadLocalRandom.current().nextDouble(-1, 1);
            double y = ThreadLocalRandom.current().nextDouble(-1, 1);
            double distance = Math.sqrt(x * x + y * y);
            if (distance <= 1) {
                pointsInsideCircle++;
            }
        }

        double pi =6.0 * pointsInsideCircle / totalPoints;
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("Число Пи: " + pi);
        System.out.println("Время выполнения (мс): " + executionTime);
    }
}


