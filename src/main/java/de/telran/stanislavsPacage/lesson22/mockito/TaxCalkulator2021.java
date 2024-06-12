package de.telran.stanislavsPacage.lesson22.mockito;

public class TaxCalkulator2021 {
private CurrentYearProvider currentYearProvider;

    public TaxCalkulator2021(CurrentYearProvider currentYearProvider) {
        this.currentYearProvider = currentYearProvider;
    }
    public double calculatorTax(double income) {
        double taxAmount = 0;
        if (currentYearProvider.getYear() == 2021) {
            taxAmount = income * 0.22;
        } else  {
            taxAmount = income * 0.25;
        }
        return taxAmount;
    }
}

