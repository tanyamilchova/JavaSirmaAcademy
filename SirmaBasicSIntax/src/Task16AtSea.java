import java.util.Scanner;

public class Task16AtSea {
    //Calculate how much will cost a vacation. There are the following types of accommodation,
    //with the following prices for staying:
    // &quot;single room&quot; – 25.00 BGN per night
    // &quot;apartment&quot; – 50.00 BGN per night
    // &quot;presidential&quot; – 100.00 BGN per night
    //Regarding the number of days of the vacation (example: 11 days = 10 nights) and the
    //type of room chosen, there is a different discount. The discounts are as follows:
    //room under 10
    //days
    //
    //between 10 and
    //15
    //
    //over 15 days
    //
    //single
    //room
    //
    //No discount No discount No discount
    //
    //apartment 30% of the
    //final price
    //
    //35% of the final
    //price
    //
    //50% of the final price
    //
    //presidentia
    //l
    //
    //10% of the
    //final price
    //
    //15% of the final
    //price
    //
    //20% of the final price
    //
    //After the stay, the assessment of the hotel&#39;s services may be positive or negative.
    // If the assessment is positive, add 25% to the price with the already deducted
    //discount.
    // If the assessment is negative, deduct 10% from the price.
    //
    //e: office@sirma.bg a: 135 Tsarigradsko Shosse, blvd.
    //m: +359 2 9768310 1784 Sofia, Bulgaria
    //
    //sirma.com
    //You take 3 parameters:
    // First - days to stay - integer in the range [0...365]
    // Second - type of room - &quot;single room&quot;, &quot;apartment&quot; or &quot;president apartment&quot;
    // Third - assessment - &quot;positive&quot; or &quot;negative&quot;
    //One line should be printed on the console:
    //• The price for the stay at the hotel, formatted to two decimal places.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int days=sc.nextInt();
        sc.nextLine();
        String typeRoom=sc.nextLine();
        String assessment=sc.nextLine();
        getPriceForRoom(days,typeRoom,assessment);
    }

    private static void getPriceForRoom(int days, String typeRoom, String assessment) {
        double discount=0;
        double price=0;
        switch (typeRoom){
            case "single room"->price=25*(days-1);
            case "apartment"->price=50*(days-1);
            case "presidential"->price=100*(days-1);
        }
        if(days<10){
            switch (typeRoom){
                case "apartment"->discount=0.30;
                case "presidential"->discount=0.10;
            }
        }else {
            if(days<=15){
                switch (typeRoom){
                    case "apartment"->discount=0.35;
                    case "presidential"->discount=0.15;
                }
            }
            else {
                switch (typeRoom){
                    case "apartment"->discount=0.50;
                    case "presidential"->discount=0.20;
                }
            }
        }
        price-=price*discount;
        switch (assessment){
            case "positive"->price+=price*0.25;
            case "negative"->price-=price*0.10;
        }
//        System.out.printf("");
        System.out.println(price);
    }
}
