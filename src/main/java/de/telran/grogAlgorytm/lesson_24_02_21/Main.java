package de.telran.grogAlgorytm.lesson_24_02_21;


public class Main {
       public static void main(String[] args) {
//            Train train = new Train(10);
//            train.addWagon(20);
//            train.addWagon(30);
//            train.addWagon(40);
//            System.out.println(train.root.next.next.next.value);
//            System.out.println(train.root.next.value);
//
//
//            System.out.println("Number wagons is " + train.numberOfWagons());
//            System.out.println(train.isWagon(41));
//            System.out.println((train.isWagon(40)));
//
//            System.out.println(train.findIndex(40));
//
//            System.out.println(train.wagonIndex(40));

           Train train = new Train(10);

           train.addWagon(20);
           train.addWagon(30);
           train.addWagon(40);
           train.removeLastWagon();
           System.out.println(train.countWagons());


           System.out.println(train.root.value);
        }

    }


