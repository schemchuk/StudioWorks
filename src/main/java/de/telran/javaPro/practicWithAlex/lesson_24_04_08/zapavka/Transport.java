package de.telran.javaPro.practicWithAlex.lesson_24_04_08.zapavka;

public class Transport implements Comparable<Transport>{
    //3) Автозаправка. По умолчанию автомобили заправляются согласно стандартной очереди FIFO. Но автомобили скорой помощи
    //всегда заправляются вне очереди.
    //В час пик, общественные автобусы получают максимальный приоритет по заправке, но скорая помощь все равно более приоритетна.
    //Во время стихийных бедствий (снегопад, наводнение) технологический транспорт городских служб заправляется вне очереди.
    //Какую бы коллекцию Вы использовали для реализацию данного алгоритма?
    //Напишите программу, которая бы имитировала работу.

    private String name;
    private  int priotyLevel;
    private TransportTypes transportTypes;

    public Transport(String name, int priotyLevel, TransportTypes transportTypes) {
        this.name = name;
        this.priotyLevel = priotyLevel;
        this.transportTypes = transportTypes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriotyLevel() {
        return priotyLevel;
    }

    public void setPriotyLevel(int priotyLevel) {
        this.priotyLevel = priotyLevel;
    }

    public TransportTypes getTransportTypes() {
        return transportTypes;
    }

    public void setTransportTypes(TransportTypes transportTypes) {
        this.transportTypes = transportTypes;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "name='" + name + '\'' +
                ", priotyLevel=" + priotyLevel +
                ", transportTypes=" + transportTypes +
                '}';
    }


    @Override
    public int compareTo(Transport o) {
        return Integer.compare(this.priotyLevel , o.priotyLevel);
    }
}
