package de.telran.stanislavsPacage.lesson2.shape;

public class Rectandle extends Shape{
    private  double sideA;
    private  double sideB;

    public Rectandle(String name, double sideA, double sideB) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }
}
