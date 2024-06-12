package de.telran.stanislavsPacage.lesson22.junitExample;

public class TaxCalculatorImpl implements TaxCalculator {

    @Override
    public double calculatorTax(double income) {

        double taxAmount = 0;

        if (income < 0) {
            throw new NegativeIncomException("Income cannot be negative");
        }
        if (income <= 20000) {
            taxAmount = income * 0.25;
        } else {
            taxAmount = 20000 * 0.25 + (income - 20000) * 0.4;
        }
        return taxAmount;
    }
}
