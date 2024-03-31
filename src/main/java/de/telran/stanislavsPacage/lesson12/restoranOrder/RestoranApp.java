package de.telran.stanislavsPacage.lesson12.restoranOrder;

public class RestoranApp {
    public static void main(String[] args) {
        OrderUtils orderUtils = new OrderUtils();

        Order order1 = new Order(1,"Pizza",10,7);
        Order order2 = new Order(2,"Soup",2,15);
        Order order3 = new Order(3,"Stake",1,25);
        Order order4 = new Order(3,"Fish",3,10);

        orderUtils.addOrder(order1);
        orderUtils.addOrder(order2);
        orderUtils.addOrder(order3);
        orderUtils.addOrder(order4);

        System.out.println("Total orders price: " + orderUtils.getTotalOrdersPrice());
        System.out.println("Total orders: " + orderUtils.getOrdersCount());

        System.out.println("Order by id = 3 " + orderUtils.getOrderById(3));

        orderUtils.deleteOrderById(3);

        System.out.println("Total orders price: " + orderUtils.getTotalOrdersPrice());
        System.out.println("Total orders: " + orderUtils.getOrdersCount());

        System.out.println(orderUtils.getOrders());
    }
}
