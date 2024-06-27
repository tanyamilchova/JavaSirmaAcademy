package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class User {


    private long id;
    private String name;
    private double money;
    private static long uniqueId=1;
    private String email;
    private String password;

    private  HashSet<Payment>payments;
    private final HashSet<CreditCardPayment>cardPayments;
    private final HashSet<PayPalPayment>payPalPayments;

    private final HashSet<Order>finishedOrders=new HashSet<>();
    private HashSet<Order>orders;
    private Order currentOrser;
    private CreditCard creditCard;
    private PayPalAccount payPalAccount;


    public User(String name, double money, String email, String password) {
        this.id=uniqueId++;
        this.name = name;
        this.money = money;
        this.email = email;
        this.password = password;
        this.orders=new HashSet<>();
        this.cardPayments=new HashSet<>();
        this.payPalPayments=new HashSet<>();
        this.payments=new HashSet<>();
    }

    public void addMoney(double money){
        this.money+=money;
        System.out.println("Your wallet now is: "+this.money);
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
    public void makePayment(Inventory inventory, PaymentProssesor processor){
        if(!orders.isEmpty()) {
            double sum = 0;
            for (Order order : orders) {
                sum += order.calculateTootalSumOrder();
            }

            Payment payment = choosePayment(Util.getTypeInput(new Scanner(System.in), "Choose a payment method"),processor);
            payment.setProssesor(processor);

            if (payment.authorisePayment(payment, this)) {
                if (this.money >= sum) {
                    payment.setTotal(sum);

                    payments.add(payment);

                    this.money -= sum;
                    finishedOrders.addAll(orders);
                    this.orders = new HashSet<>();
                    System.out.println("You have just made a payment for " + sum);
                    System.out.println("Your wallet is: " + this.money);
                } else {
                    System.out.println("Not sufficient wallet");
                    for (Order o : orders) {
                        for (Inventory inv : o.getItemList()) {
                            inventory.addToMap(inv);
                        }
                    }
                    this.orders = new HashSet<>();
                    Order.itemList = new ArrayList<>();
                }
            }else {
                System.out.println("Unauthorised");
            }
            } else {
                System.out.println("You have not any Order for payment");

            }

    }
    public Payment choosePayment(Payment.Type paimentType,PaymentProssesor prossesor){
        if(paimentType.equals(Payment.Type.PAYPAL)) {
            if(this.payPalAccount==null) {
                this.payPalAccount = new PayPalAccount(this.email,this.password);
                prossesor.addToMapPaypalAccount(payPalAccount);
            }
            return new PayPalPayment(this.id, LocalDate.now(), paimentType, this.email, this.password);
        } else {
            if(this.creditCard==null) {
                this.creditCard = new CreditCard(Util.generateRandomString(16), this.name, LocalDate.now().minusMonths(12), Util.generateRandomString(3));
                prossesor.addToMapCreditCard(creditCard);
            }
            return new CreditCardPayment(this.id,LocalDate.now(),paimentType,this.creditCard.getCardNumber(),this.creditCard.getSvvCode(),this.creditCard.getExpDate());
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

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public PayPalAccount getPayPalAccount() {
        return payPalAccount;
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
    public void seePayments(){
        for (Payment payment:payments){
            System.out.println(payment.type+":"+payment.total);
        }
    }
}
