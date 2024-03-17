package de.telran.stanislavsPacage.lesson6.shape.service;


import de.telran.stanislavsPacage.lesson6.shape.entity.Circle;
import de.telran.stanislavsPacage.lesson6.shape.entity.Rectandle;
import de.telran.stanislavsPacage.lesson6.shape.entity.Square;
import de.telran.stanislavsPacage.lesson6.shape.entity.Triangle;

public class CreateShape {

    public Circle greateCirkle(double radius){
        return new Circle("Cirkle", radius);
    }

    public Square createSquare(double side) {
        return new Square("Square", side);
    }


    public Rectandle createRestandle(double sideA, double sideB){
        return new Rectandle("Restandle",sideA,sideB);
    }

    public Triangle createTriangle(double side) {
        return new Triangle("Triangle", side);
    }
}