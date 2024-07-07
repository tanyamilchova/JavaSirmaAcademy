package org.example.task2.taskB;

public class DemoCalculator {
    public static void main(String[] args) {
        System.out.println(DiscountFactory.getDiscount("student",150));
        System.out.println(DiscountFactory.getDiscount("senior",150));

    }
}
