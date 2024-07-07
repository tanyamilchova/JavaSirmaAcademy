package org.example.task2.taskB;

public class Senior implements DiscountCalculator{
    @Override
    public double calculateDiscount(double price) {
        return price*0.2;
    }
}
