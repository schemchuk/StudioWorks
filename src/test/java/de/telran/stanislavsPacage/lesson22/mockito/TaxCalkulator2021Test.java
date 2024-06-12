package de.telran.stanislavsPacage.lesson22.mockito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class TaxCalkulator2021Test {

    @Test
    void calculatorTaxCurrentJear() {
        CurrentYearProvider currentYearProvider = new CurrentYearProviderImplementation();
        TaxCalkulator2021 calkulator2021 = new TaxCalkulator2021(currentYearProvider);

        double incom = 1000;
        double expectedTax = 1000 * 0.25;
        double actualTax = calkulator2021.calculatorTax(incom);

        assertEquals(expectedTax, actualTax);
    }

    @Test
    public void calculatorTaxFor2021() {
        CurrentYearProvider currentYearProvider = mock(CurrentYearProvider.class);
        TaxCalkulator2021 calkulator2021 = new TaxCalkulator2021(currentYearProvider);

        when(currentYearProvider.getYear()).thenReturn(2021);

        double incom = 1000;
        double expectedTax = 1000 * 0.22;
        double actualTax = calkulator2021.calculatorTax(incom);

        assertEquals(expectedTax, actualTax);
    }

}