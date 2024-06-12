package de.telran.stanislavsPacage.lesson22.mockito;

import java.time.LocalDate;

public class CurrentYearProviderImplementation implements CurrentYearProvider {

    @Override
    public int getYear() {
        return LocalDate.now().getYear();
    }
}
