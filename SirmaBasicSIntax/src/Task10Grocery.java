import java.util.Scanner;

public class Task10Grocery {
    //A chain of stores opens groceries in several cities and sells at different prices according to
    //the city:
    //City /
    //Product tea water juice sweets chips
    //Sofia 0.50 0.80 1.20 1.45 1.60
    //Plovdiv 0.40 0.70 1.15 1.30 1.50
    //Varna 0.45 0.70 1.10 1.35 1.55
    //
    //Write a program that accepts a product (string), city (string) and quantity (decimal
    //number) and calculates and prints how much the corresponding quantity of the selected
    //product costs in the specified city.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String product=sc.nextLine();
        String city=sc.nextLine();
        int quantity=sc.nextInt();
        double bill=getPrice(product,city,quantity);
        System.out.printf("%.2f",bill);
    }

    public static double getPrice(String product,String city,int quantity){
        double price=0;
        if(product.equals("tea")){
            switch (city){
                case "Sofia"->price=0.50;
                case "Plovdiv"->price=0.40;
                case "Varna"->price=0.45;
            }
        }else {
            if(product.equals("water")){
                switch (city){
                    case "Sofia"->price=0.80;
                    case "Plovdiv"->price=0.70;
                    case "Varna"->price=0.70;
                }
            }else {
                if(product.equals("juice")){
                    switch (city){
                        case "Sofia"->price=1.20;
                        case "Plovdiv"->price=1.15;
                        case "Varna"->price=1.10;
                    }
                }else {
                    if(product.equals("sweets")){
                        switch (city){
                            case "Sofia"->price=1.45;
                            case "Plovdiv"->price=1.30;
                            case "Varna"->price=1.35;
                        }
                    }else {
                        if (product.equals("chips")) {
                            switch (city){
                                case "Sofia"->price=1.60;
                                case "Plovdiv"->price=1.50;
                                case "Varna"->price=1.55;
                            }
                        }
                    }
                }
            }
        }
        return quantity*price;
    }
}
