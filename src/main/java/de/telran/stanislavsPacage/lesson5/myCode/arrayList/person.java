package de.telran.stanislavsPacage.lesson5.myCode.arrayList;

import java.util.Objects;

public class person {

   private String name;
   private int ade;
   private long personalCode;

    public person(String name, int ade, long personalCode) {
        this.name = name;
        this.ade = ade;
        this.personalCode = personalCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAde() {
        return ade;
    }

    public void setAde(int ade) {
        this.ade = ade;
    }

    public long getPersonalCode() {
        return personalCode;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", ade=" + ade +
                ", personalCode=" + personalCode +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        person person = (person) o;
        return ade == person.ade && personalCode == person.personalCode && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ade, personalCode);
    }

    public void say() {
      System.out.println("Hallo! My name is: " + name);
  }


}
