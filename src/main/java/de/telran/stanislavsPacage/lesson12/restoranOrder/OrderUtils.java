package de.telran.stanislavsPacage.lesson12.restoranOrder;

import de.telran.stanislavsPacage.lesson12.restoranOrder.Order;

import java.util.Iterator;
import java.util.LinkedList;

public class OrderUtils {
    private LinkedList<Order> orders = new LinkedList<>();
    public LinkedList<Order> getOrders(){
        return orders;
    }

    public void  addOrder(Order order) {
        orders.add(order);
    }

    public void  deleteOrderById(int id) {
        Iterator<Order> iterator = orders.iterator();
            while (iterator.hasNext()){

                if (iterator.next().getId() == id) {
                    iterator.remove();
                }
        }
    }

    public int getOrdersCount(){
        return orders.size();
    }

    public Order getOrderById(int id){

        for (Order order : orders) {
            if (order.getId() == id) {
                return order;
            }
        }
        return null;
    }



    public double getTotalOrdersPrice(){
        double totalPrice = 0;
        for (Order order : orders) {
            totalPrice += order.getTotalPrice();
        }
        return totalPrice;
    }

}
