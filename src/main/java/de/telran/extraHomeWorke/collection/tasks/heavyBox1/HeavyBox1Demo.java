package de.telran.extraHomeWorke.collection.tasks.heavyBox1;

import java.util.ArrayList;
import java.util.List;

public class HeavyBox1Demo {
    /**
     *   Создать коллекцию, содержащую объекты HeavyBox.
     *     Написать метод, который перебирает элементы коллекции и проверяет вес коробок.
     *     Если вес коробки больше 300 гр, коробка перемещается в другую коллекцию.
     */

    public static void main(String[] args) {
        List<HeavyBox1> box1s = new ArrayList<>();
        box1s.add(new HeavyBox1(220));
        box1s.add(new HeavyBox1(320));
        box1s.add(new HeavyBox1(140));
        box1s.add(new HeavyBox1(450));
        box1s.add(new HeavyBox1(530));

        List<HeavyBox1> heavyBoxes = HeavyBox1.moveHeavyBoxes(box1s);
        System.out.println("Schwierige boxes: ");

        for (HeavyBox1 heavy : heavyBoxes){
            System.out.println(heavy);
        }

    }
}
