package de.telran.stanislavsPacage.lesson8.hacsCodeExample.mapKeyCollision;

import java.util.Objects;

public class PersonForCat {
    String nane;

    public PersonForCat(String nane) {
        this.nane = nane;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonForCat that = (PersonForCat) o;
        return Objects.equals(nane, that.nane);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nane);
    }

    @Override
    public String toString() {
        return "PersonForCat{" +
                "nane='" + nane + '\'' +
                '}';
    }
}
