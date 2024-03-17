package de.telran.stanislavsPacage.lesson6.shape.entity;

public class Square extends Shape{

    private double sideA;


    public Square(String title, double siteA) {
        super(title);
        this.sideA = siteA;

    }


    @Override
    public String toString() {
        return "Rectandle{" +
                "siteA=" + sideA +
                '}';
    }

    @Override
    public double calculateArea() {
        return sideA*sideA;
    }

    @Override
    public double calculatePerimeter() {
        return 4*(sideA);
    }
}



