package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Util {
    Scanner sc = new Scanner(System.in);

    static double getDoubleInput(Scanner sc, String prompt) {
        while (true) {
            System.out.println(prompt);
            try {
                return Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    static long getLongInput(Scanner sc, String prompt) {
        while (true) {
            System.out.println(prompt);
            try {
                return Long.parseLong(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    static boolean getBooleanInput(Scanner sc, String prompt) {
        while (true) {
            System.out.println(prompt);
            String input = sc.nextLine();
            if ("true".equalsIgnoreCase(input) || "false".equalsIgnoreCase(input)) {
                return Boolean.parseBoolean(input);
            } else {
                System.out.println("Invalid input. Please enter 'true' or 'false'.");
            }
        }
    }

    static AbstractItem.CATEGORY getCategoryInput(Scanner sc, String prompt) {
        while (true) {
            System.out.println(prompt);
            String input = sc.nextLine();
            ArrayList<String>enumValues=new ArrayList<>(List.of("ELECTRONIC_ITEM","GROSSER_ITEM","FRAGILE_ITEM"));
            try {
                if(! enumValues.contains(input)){
                    System.out.println("The valid categories are: ELECTRONIC_ITEM, GROSSER_ITEM,FRAGILE_ITEM");
                }
                return AbstractItem.CATEGORY.valueOf(input);
            } catch (IllegalArgumentException e) {
                System.out.println("Enter a valid category: ELECTRONIC_ITEM, GROSSER_ITEM,FRAGILE_ITEM");
            }
        }
    }
    static Payment.Type getTypeInput(Scanner sc, String prompt) {
        while (true) {
            System.out.println(prompt);
            String input = sc.nextLine();
            ArrayList<String>enumValues=new ArrayList<>(List.of("CREDIT_CARD,PAYPAL"));
            try {
                if(! enumValues.contains(input)){
                    System.out.println("The valid categories are: CREDIT_CARD,PAYPAL");
                }
                return Payment.Type.valueOf(input);
            } catch (IllegalArgumentException e) {
                System.out.println("Enter a valid category: CREDIT_CARD,PAYPAL");
            }
        }
    }

    public static int getIntInput(Scanner sc, String prompt) {
        while (true){
            System.out.println(prompt);
            try{
               return  Integer.parseInt(sc.nextLine());
            }catch (IllegalArgumentException e){
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }
    public static boolean checkNotNullOrder(Order order){
       if(order==null){
           System.out.println("Create an Order first - choice 4 from  the Menu");
       }
       return order!=null;
    }

    public static String generateRandomString(int number) {
        Random random = new Random();
        StringBuilder cardNumber = new StringBuilder();

        for (int i = 0; i < number; i++) {
            int digit = random.nextInt(10);
            cardNumber.append(digit);
        }
        return cardNumber.toString();
    }
}