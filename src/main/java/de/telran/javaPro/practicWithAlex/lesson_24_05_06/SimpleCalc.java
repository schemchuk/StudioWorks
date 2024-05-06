package de.telran.javaPro.practicWithAlex.lesson_24_05_06;

public class SimpleCalc {
    public static void main(String[] args) {
        NumericalOperations<Integer> calc = new CalcInteger();
        System.out.println(calc.add(19,30));
    }
}
