package org.example;

import java.util.ArrayList;
import java.util.HashSet;

public class User {
    private long id;
    private String name;
    private double money;
    private static long uniqueId=1;
    private final HashSet<Payment>payments;
    private final HashSet<Order>finishedOrders=new HashSet<>();
    private HashSet<Order>orders;
    private Order currentOrser;

    public User(String name, double money) {
        this.name = name;
        this.money = money;
        this.orders=new HashSet<>();
        this.payments=new HashSet<>();
        this.id=uniqueId++;
    }

    public void addMoney(double money){
        this.money+=money;
    }
    public Order createOrder(){
        if(this.currentOrser==null) {
            System.out.println("You opened a new Order");

            return new Order(this.id);
        }
        else {
            System.out.println("You already have an open Order: "+this.currentOrser.getId());
            return this.currentOrser;
        }
    }
    public void addOrderToList(Order order){
        this.orders.add(order);
        System.out.println("List with orders: "+this.orders);
    }
    public void makePayment(Inventory inventory){
        if(!orders.isEmpty()) {
            double sum = 0;
            for (Order order : orders) {
                sum += order.calculateTootalSumOrder();
            }
            if (this.money >= sum) {
                Payment payment = new Payment(this.id);
                payment.setTotal(sum);
                payments.add(payment);
                this.money -= sum;
                finishedOrders.addAll(orders);
                this.orders=new HashSet<>();
                System.out.println("You have just made a payment for " + sum);
                System.out.println("Your wallet is: " + this.money);
            } else {
                System.out.println("Not sufficient wallet");
                for (Order o:orders) {
                    for (Inventory inv:o.getItemList()){
                        inventory.addToMap(inv);
                    }
                }
                this.orders=new HashSet<>();
                Order.itemList=new ArrayList<>();
            }
        }else {
            System.out.println("You have not any Order for payment");

        }
    }
    public void getUserDetails(){
        System.out.println("Id:"+this.id);
        System.out.println("Wallet: "+this.money);
        System.out.println("Name: "+this.name);
        System.out.println("Your current orders: "+this.orders);
        System.out.println("Your finished orders: "+this.finishedOrders);
        System.out.println("Your payments "+this.payments);
    }

    public long getId() {
        return id;
    }

    public HashSet<Order> getOrders() {
        return orders;
    }

    public void setCurrentOrser(Order currentOrser) {
        this.currentOrser = currentOrser;
    }

    public Order getCurrentOrser() {
        return currentOrser;
    }

    public HashSet<Order> getFinishedOrders() {
        return finishedOrders;
    }
}
