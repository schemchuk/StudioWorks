package de.telran.stanislavsPacage.lesson6.shape.entity;

public class Rectandle extends Shape{

    private double sideA;
    private double sideB;

    public Rectandle(String title, double siteA, double siteB) {
        super(title);
        this.sideA = siteA;
        this.sideB = siteB;
    }





    @Override
    public String toString() {
        return "Rectandle{" +
                "siteA=" + sideA +
                ", siteB=" + sideB +
                '}';
    }

    @Override
    public double calculateArea() {

        return sideA*sideB;
    }

    @Override
    public double calculatePerimeter() {

        return 2*(sideA+sideB);
    }
}



