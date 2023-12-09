package de.telran._JavaProStudio.module1.lesson3.statiks;

public class Cat {
    public String name;
    private int age;

    static int countCats;
    public Cat(String name) {
        this.name = name;
        countCats++;
    }

    public void setAge(int age) {
        this.age = age;
    }

    static  void inc() {
        countCats++;
    }

}
