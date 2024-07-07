package org.example.task1.taskB;

import java.time.LocalDateTime;

public class Invoice {
    private double amount;
    private String customerName;
    private LocalDateTime dateTime;

    public Invoice(double amount, String customerName, LocalDateTime dateTime) {
        this.amount = amount;
        this.customerName = customerName;
        this.dateTime = dateTime;
    }

    private void printInvoice(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Invoice{" +"\n"+
                "amount=" + amount +"\n"+
                ", customerName='" + customerName + '\'' +"\n"+
                ", dateTime=" + dateTime +
                '}'+"\n";
    }
}
