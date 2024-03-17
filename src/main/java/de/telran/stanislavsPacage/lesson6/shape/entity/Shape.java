package de.telran.stanislavsPacage.lesson6.shape.entity;

public abstract class Shape {
    private String title;

    public Shape(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}



