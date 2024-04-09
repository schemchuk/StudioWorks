package de.telran.javaPro.practicWithAlex.lesson_24_04_08.zapavka;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class GasStation {
    public static void main(String[] args) {
        Transport transport1 = new Transport("Ambulance1", 1, TransportTypes.AMBULANCE);
        Transport transport2 = new Transport("Avariyna", 2, TransportTypes.SERVICE);
        Transport transport3 = new Transport("Bus", 2, TransportTypes.BUSES);
        Transport transport4 = new Transport("Auto1", 2, TransportTypes.CAR);
        Transport transport5 = new Transport("Auto2", 2, TransportTypes.CAR);

        Queue<Transport> transportQueue = new PriorityQueue<>();
        transportQueue.add(transport5);
        transportQueue.add(transport4);
        transportQueue.add(transport3);
        transportQueue.add(transport2);
        transportQueue.add(transport1);

        System.out.println(transportQueue);

        // час пик
        Queue<Transport> transportQueuePick = new PriorityQueue<>(new Comparator<Transport>() {
            @Override
            public int compare(Transport o1, Transport o2) {
                if (o1.getTransportTypes().equals(TransportTypes.SERVICE) ||
                        o1.getTransportTypes().equals(TransportTypes.CAR)) {
                    o1.setPriotyLevel(3);
                }

                if (o2.getTransportTypes().equals(TransportTypes.SERVICE) ||
                        o2.getTransportTypes().equals(TransportTypes.CAR)) {
                    o2.setPriotyLevel(3);
                }

                return Integer.compare(o1.getPriotyLevel(), o2.getPriotyLevel());
            }
        });

    }
}
