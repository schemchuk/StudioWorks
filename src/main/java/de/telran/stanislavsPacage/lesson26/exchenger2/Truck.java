package de.telran.stanislavsPacage.lesson26.exchenger2;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.Exchanger;

public class Truck implements  Runnable{
    private int truckNumber;
    private String startPoint;
    private String endPoint;
    private final String[] goods;

    private final Exchanger exchanger;

    public Truck(int truckNumber, String startPoint, String endPoint, String[] goods, Exchanger exchanger) {
        this.truckNumber = truckNumber;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.goods = goods;
        this.exchanger = exchanger;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "truckNumber=" + truckNumber +
                ", startPoint='" + startPoint + '\'' +
                ", endPoint='" + endPoint + '\'' +
                ", goods=" + Arrays.toString(goods) +
                ", exchanger=" + exchanger +
                '}';
    }

    @Override
    public void run() {
        System.out.println("Truck " + truckNumber + " is loading with goods: " + Arrays.toString(goods));
        System.out.println("Truck " + truckNumber + " starts from " + startPoint + " to " + endPoint);
        try {
            Random random = new Random();
            Thread.sleep(random.nextInt(4000) + 2000); // в дороге

            // грузовики достигли точки обмена грузом и производят обмен товаром
            System.out.println("Truck " + truckNumber + " arrives at point E for goods exchange");
            goods[1] = (String) exchanger.exchange(goods[1]);
            System.out.println("Truck " + truckNumber + " exchanged goods at point E. Received goods: " + Arrays.toString(goods));
            Thread.sleep(2000);
            System.out.println("Truck " + truckNumber + " arrives at " + endPoint + " and delivers goods " + Arrays.toString(goods));
        } catch (InterruptedException e ) {}
    }
    }

