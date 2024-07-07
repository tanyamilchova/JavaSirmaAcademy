package org.example.task2.taskB;

public class StudentCalculator implements DiscountCalculator {
    @Override
    public double calculateDiscount(double price) {
        return price*0.1
                ;
    }
}
