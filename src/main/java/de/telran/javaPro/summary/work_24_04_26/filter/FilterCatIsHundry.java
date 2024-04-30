package de.telran.javaPro.summary.work_24_04_26.filter;

import de.telran.javaPro.summary.work_24_04_19.Cat;

public class FilterCatIsHundry implements Filter<Cat> {

    @Override
    public boolean apply(Cat cat) {
        return cat.isHundry();
    }
}
