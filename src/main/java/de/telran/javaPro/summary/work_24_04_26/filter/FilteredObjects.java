package de.telran.javaPro.summary.work_24_04_26.filter;

import java.util.ArrayList;
import java.util.List;

public class FilteredObjects<T> {
    private List<T> items;

    public FilteredObjects(List<T> items) {
        this.items = items;
    }

    public List<T> applyFilter(Filter<T> filter){
        List<T> result = new ArrayList<>();
        for (T item : items) {
            if (filter.apply(item)) {
                result.add(item);
            }
        }
        return result;
    }
}
