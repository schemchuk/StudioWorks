package de.telran.stanislavsPacage.lesson12.restoranOrder;

public class Order {
    private int id;
    private String DichName;
    private int numberOfDish;
    private double costOfDish;

    public Order(int id, String dichName, int numberOfDish, double costOfDish) {
        this.id = id;
        DichName = dichName;
        this.numberOfDish = numberOfDish;
        this.costOfDish = costOfDish;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDichName() {
        return DichName;
    }

    public void setDichName(String dichName) {
        DichName = dichName;
    }

    public int getNumberOfDish() {
        return numberOfDish;
    }

    public void setNumberOfDish(int numberOfDish) {
        this.numberOfDish = numberOfDish;
    }

    public double getCostOfDish() {
        return costOfDish;
    }

    public void setCostOfDish(double costOfDish) {
        this.costOfDish = costOfDish;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", DichName='" + DichName + '\'' +
                ", numberOfDish=" + numberOfDish +
                ", costOfDish=" + costOfDish +
                '}';
    }

    public double getTotalPrice() {
        return  numberOfDish * costOfDish;
    }
}
