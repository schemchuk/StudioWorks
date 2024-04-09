package de.telran.javaPro.lections.lesson_24_04_08;

import java.util.*;

public class Tiket {
    private  String departure;
    private String destination;

    public Tiket(String departure, String destination) {
        this.departure = departure;
        this.destination = destination;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Tikets{" +
                "departure='" + departure + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }

    public static void main(String[] args) {
       Tiket tiket1 = new Tiket("Berlin","London");
       Tiket tiket2 = new Tiket("Tokio","London");
       Tiket tiket3 = new Tiket("Mumbai","Berlin");
       Tiket tiket4 = new Tiket("Seol","Mumbai");
        List<Tiket> tiketList = Arrays.asList(tiket1,tiket2,tiket3,tiket4);
        //printRoute(tiketList);


    }

//    public static void printRoute(List<Tiket> tiketList){
//        Map<String, String>  ticketMap = new HashMap<>();
//        for (Tiket tiket : tiketList) {
//            ticketMap.put(tiket.departure, tiket.destination);
//        }
//        System.out.println();
//        String city = tiketList.get(0).departure;
//        while (ticketMap.containsKey(city)){
//            city = ticketMap.get(city);
//        }
//        System.out.println(city);
//
//        Map<String,String> roteMap = new HashMap<>();
//        for (Tiket tiket : tiketList) {
//            ticketMap.put(tiket.destination, tiket.departure);
//        }
//        System.out.println();
//        String city = tiketList.get(0).departure;
//        while (roteMap.containsKey(city)) {
//            city = roteMap.get(city); for (Tiket tiket : tiketList) {
//                ticketMap.put(tiket.departure, tiket.destination);
//            }
//            System.out.println();
//            String city = tiketList.get(0).departure;
//            while (ticketMap.containsKey(city)){
//                city = ticketMap.get(city);
//            }
//            System.out.println(city);
//
//        }
//    }
}
