import java.util.Scanner;

public class Task13VegetableMarket {

    //The vegetable market works on working days at the following prices:
    //vegetable tomato onion lettuce cucumber pepper
    //price 2.50 1.20 0.85 1.45 5.50
    //
    //Saturday and Sunday the stock exchange operate at higher prices:
    //vegetable tomato onion lettuce cucumber pepper
    //price 2.80 1.30 0.85 1.75 3.50
    //Write a program that accepts vegetable (tomato / onion / lettuce / cucumber /
    //pepper), day of the week (Monday / Tuesday / Wednesday / Thursday / Friday /
    //Saturday / Sunday) and quantity (real number) and calculates the price according to
    //the prices in the tables above.
    //• Print the result rounded by 2 decimal places.
    //• In case of an invalid day of the week or invalid vegetable name, print &quot;error&quot;.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String vegetable=sc.nextLine();
        String day=sc.nextLine();
        int quantity=sc.nextInt();
        double sum=getSum(vegetable,day,quantity);
        System.out.println(sum);

    }

    private static double getSum(String vegetable, String day, int quantity) {
        double price=0;
        if(day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")){
            switch (vegetable){
                case "tomato"->price=2.80;
                case "onion"->price=1.30;
                case "lettuce"->price=0.85;
                case "cucumber"->price=1.75;
                case "pepper"->price=5.50;
            }
        }else {
            if(day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Tuesday") || day.equalsIgnoreCase("Wednesday")||day.equalsIgnoreCase("Thursday") || day.equalsIgnoreCase("Friday")) {
                switch (vegetable){
                    case "tomato"->price=2.50;
                    case "onion"->price=1.20;
                    case "lettuce"->price=0.85;
                    case "cucumber"->price=1.45;
                    case "pepper"->price=3.50;
                }
            }else {
                System.out.println("Wrong input");
            }
        }
        return quantity*price;
    }
}
