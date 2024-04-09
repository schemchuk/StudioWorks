package de.telran.stanislavsPacage.lesson2.shape;

public class ShapesAreaWithInh {
    public static void main(String[] args) {
        ShapeUtils su = new ShapeUtils();
        Shape[] shapes = {
                new Circle("circle1",2),
                new Circle("circle2",5),
                new Circle("circle3",10),
                new Rectandle("rectandle1", 20,6),
                new Rectandle("rectandle2", 5,15),
                new Rectandle("rectandle3", 10,25),
        };

        System.out.println("Sum all areas is " + su.sumAreas(shapes));


    }
}
