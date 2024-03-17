package de.telran.stanislavsPacage.lesson6.shape.core;

import de.telran.stanislavsPacage.lesson6.shape.entity.Shape;
import de.telran.stanislavsPacage.lesson6.shape.service.ShapeUtil;

import java.util.List;

public class ShapeCore {
    public void run(){

        ShapeUtil shapeUtil = new ShapeUtil();
        List<Shape> randomShapeList = shapeUtil.createRandomShapeList(10,50);



        for (int i = 0; i < randomShapeList.size(); i++) {
            System.out.println("Our shapes: ");
            System.out.println(randomShapeList.get(i));
            System.out.println("Share area: " + randomShapeList.get(i).calculateArea());
            System.out.println("Share perimetet: " + randomShapeList.get(i).calculatePerimeter());
        }
            System.out.println("Our shapes areas : " + shapeUtil.CalculateTotalShapesArea(randomShapeList));
            System.out.println("Our shapes perimetr : " + shapeUtil.CalculateTotalShapesArea(randomShapeList));

    }
}
