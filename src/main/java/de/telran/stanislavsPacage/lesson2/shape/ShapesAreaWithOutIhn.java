package de.telran.stanislavsPacage.lesson2.shape;

public class ShapesAreaWithOutIhn {
    public static void main(String[] args) {
        Circle[] circlesW = {
                new Circle("circle1",2),
                new Circle("circle2",5),
                new Circle("circle3",10)
        };
        Rectandle[] rectandleW = {
                new Rectandle("rectandle1", 20,6),
                new Rectandle("rectandle2", 5,15),
                new Rectandle("rectandle3", 10,25),
        };
        double totalShapeArea = 0;
        for (int i = 0; i < circlesW.length; i++) {
            totalShapeArea = totalShapeArea + circlesW[i].calculateArea();
        }

        for (int i = 0; i < rectandleW.length; i++) {
            totalShapeArea = totalShapeArea + rectandleW[i].calculateArea();
        }

        System.out.println("Total areas of our shapes is " + totalShapeArea);
    }
}
