package de.telran.stanislavsPacage.lesson13.lambda;

public class AvgExample1 {
    public static void main(String[] args) {
        IAverage ref;
        ref = (a,b,c) -> (a + b + c) / 3.0;
        System.out.println("Our average amount = " + ref.Avg(3, 7 , 8));

    }
}
