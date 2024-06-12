package de.telran.stanislavsPacage.lesson26.exchenger;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Exchanger;

public class DeliveryExample {
    public static void main(String[] args) {
        //создаем Exchenger
        Exchanger<List<String >> exchanger = new Exchanger<>();

        //создаем список товаров для грузовика 1, 2

        List<String> goods1 = Arrays.asList("Item 1 from A", "Item 2 from A", "Item 3 from A");
        List<String> goods2 = Arrays.asList("Item 4 from B", "Item 5 from B", "Item 6 from B");

        Truck truck1 = new Truck(1, "Factory A", "Warenhouse C",goods1, exchanger);
        Truck truck2 = new Truck(2, "Factory B", "Warenhouse D",goods2, exchanger);

        new Thread(truck1).start();
        new Thread(truck2).start();
    }
}
