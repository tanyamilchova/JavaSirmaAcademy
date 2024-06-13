import java.util.Scanner;

public class Task14Holiday {
    //A young programmer has a certain budget and free time in a given season. Write a
    //program that accepts the budget and the season and calculates where the programmer
    //will go on vacation and how much he will spend from his budget.
    //The budget determines the destination, and the season determines how much of the
    //budget he will spend. If it&#39;s summer, he&#39;ll be camping, in winter he is going to a hotel.
    //If he is in Asia, regardless of the season he will rest in a hotel. Each campsite or hotel,
    //according to the destination, has its own price which corresponds to a given percentage of
    //the budget:
    // At 100lv. or less – somewhere in Bulgaria
    //o Summer – 30% of the budget
    //o Winter – 70% of the budget
    // At 1000lv. Somewhere in Europe, somewhere in Europe.
    //o Summer – 40% of the budget
    //o Winter – 80% of the budget
    // With more than 1000lv. Somewhere in Asia
    //o On vacation in Asia, regardless of the season will spend 90% of the budget.
    //
    //Input:
    //The function takes 2 parameters:
    //• First parameter – Budget, real number in the range [10.00...5000.00].
    //• Second parameter – One of two possible seasons: &quot;summer&quot; or &quot;winter&quot;
    //Output:
    //Two lines must be printed on the console.
    //• First line – &quot;Somewhere in [destination]&quot; among &quot;Bulgaria&quot;, &quot;Europe&quot; and &quot;Asia&quot;
    //• Second line – &quot;{Type of holiday} – {Amount spent}&quot;
    //The holiday can be on &quot;Camp&quot; or &quot;Hotel&quot;. The sum must be rounded to the nearest
    //second character after the comma.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double budget=sc.nextDouble();
        sc.nextLine();
        String season=sc.nextLine();
        getHolidayPrice(budget,season);
    }

    private static void getHolidayPrice(double budget, String season) {
        String destination="";
        String typeOfHoliday="";
        double price=0;
        switch (season){
            case "winter"->typeOfHoliday="Hotel";
            case "summer"->typeOfHoliday="Camping";
        }
        if(budget>=10.00 && budget<=5000){

            if(budget<=1000){
                if(budget<=100){
                    destination="Bulgaria";
                    switch (season){
                        case "summer"->price=budget*0.30;
                        case "winter"->price=budget*0.70;
                    }
                }else {
                    destination="Europe";
                   switch (season){
                       case "winter"->price=budget*0.80;
                       case "summer"->price=budget*0.40;
                   }
                }
            }else {
                destination="Asia";
                price=budget*0.90;

            }
        }else {
            System.out.println("Wring output");
        }
        System.out.println("Somewhere in "+destination);
        System.out.printf("%s - %.2f",typeOfHoliday,price);
    }
}
