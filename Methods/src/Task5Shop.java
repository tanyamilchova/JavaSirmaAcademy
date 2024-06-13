import java.util.Scanner;

public class Task5Shop {
    //Write a method that calculates the total price of an order and prints it on the console. The
    //method should receive one of the following products: coffee, water, coke, snacks, and
    //a quantity of the product. The prices for a single piece of each product are:
    // coffee – 1.50
    // water – 1.00
    // coke – 1.40
    // snacks – 2.00
    //
    //e: office@sirma.bg a: 135 Tsarigradsko Shosse, blvd.
    //m: +359 2 9768310 1784 Sofia, Bulgaria
    //
    //sirma.com
    //Print the result rounded to the second decimal place.
    //Input Outpu
    //t
    //water
    //5
    //5.00
    //coffe
    //e
    //2
    public static double coffee=1.50;
    public static double water=1.00;
    public static double coke=1.40;
    public static double snacks=2.00;

    public static void getTotalOfProduct(String product,int amount){
        double total=0;
        switch (product){
            case "coffee"->total=coffee*amount;
            case "water"->total=water*amount;
            case "coke"->total=coke*amount;
            case "snacks"->total=snacks*amount;
        }
        System.out.printf("%.2f",total);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String product=sc.nextLine();
        int amount=Integer.parseInt(sc.nextLine());
        getTotalOfProduct(product,amount);

    }
}
