package org.example.task2.taskB;

public class DiscountFactory {
    private String type;
    public static double getDiscount(String type,double price){
        DiscountCalculator discountCalculator;
        switch (type){
            case "student"-> {discountCalculator=new StudentCalculator();
                return discountCalculator.calculateDiscount(price);
            }
            case "senior"->{discountCalculator=new Senior();
            return discountCalculator.calculateDiscount(price);}
            default -> throw new IllegalArgumentException("Unknown calculator type: "+type);
        }
    }
}
