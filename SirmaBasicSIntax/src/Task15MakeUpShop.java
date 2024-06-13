import java.util.Scanner;

public class Task15MakeUpShop {
    // Write a program that calculates the profit from the order in a makeup shop.
    //Makeup prices:
    //• powder - 2.60 lv.
    //• lipstick - 3 lv.
    //• spiral - 4.10 lv.
    //• shadows - 8.20 lv.
    //• concealer - 2 lv.
    //If the ordered makeup count is 50 or more, the store makes a discount of 25% of the
    //total price. Of the money earned, the shop must give 10% off the rent of the store. Find
    //out if the money will be enough to do the renovation of the shop, needed to stay in
    //business.
    //Input
    //You get 6 parameters:
    //• Price of the renovation - a real number in the range [1.00 ... 10000.00]
    //• count of powders - integer in the range [0... 1000]
    //• count of lipsticks - an integer in the range [0 ... 1000]
    //• count of spirals - an integer in the range [0 ... 1000]
    //• count of shadows - an integer in the range [0 ... 1000]
    //• count of correctors - integer in the range [0 ... 1000]
    //Output
    //Print on the Console:
    //• If the money is enough, print:
    //o &quot;Yes! {remaining money} lv left.&quot;
    //• If the money is NOT enough, print:
    //o &quot;Not enough money! {the lack of money} lv needed.&quot;
    //
    //The result must be formatted to two decimal places.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double renovPrice=sc.nextDouble();
        int pouders=sc.nextInt();
        int lipstics=sc.nextInt();
        int spiral=sc.nextInt();
        int shadows=sc.nextInt();
        int concealer=sc.nextInt();
        calculateProfit(renovPrice,pouders,lipstics,spiral,shadows,concealer);

    }

    private static void calculateProfit(double renovPrice, int pouders, int lipstics, int spiral, int shadows, int concealer) {

        double price=0;
        double profit=0;
        double turnOver=pouders*2.60+lipstics*3+spiral*4.10+shadows*8.2+concealer*2;
        int sumProsucts=pouders+lipstics+spiral+shadows+concealer;
        if(sumProsucts>=50){
            turnOver*=0.75;
        }
        profit=turnOver*0.9;
        if(profit>=renovPrice){
            System.out.printf("Yes! %.2f lv left.",(profit-renovPrice));
        }else {
            System.out.printf("Not enough money! %.2f lv needed.",renovPrice-profit);
        }
    }
}
