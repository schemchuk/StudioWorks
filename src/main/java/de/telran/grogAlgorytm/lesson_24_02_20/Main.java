package de.telran.grogAlgorytm.lesson_24_02_20;

public class Main {
    private Wagon root;

    public static void main(String[] args) {
        Train train = new Train(10);
        System.out.println(train.root.next);
    }
    public void addWagon(int value){
        Wagon current = this.root;
        while (current.next != null) current = current.next;
        current.next = new Wagon(value);
    }
}
