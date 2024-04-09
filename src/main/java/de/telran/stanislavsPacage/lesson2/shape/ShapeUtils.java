package de.telran.stanislavsPacage.lesson2.shape;

public class ShapeUtils {
    public  double sumAreas(Shape[] shapes){
        double totalAreas = 0;
        for (int i = 0; i < shapes.length; i++) {
             totalAreas = totalAreas + shapes[i].calculateArea();
        }
        return totalAreas;
    }
}
