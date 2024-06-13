import java.util.Scanner;

public class Task22DiscountCalculator {
    //Write a console program that calculates the discount a customer receives based on their age
    //and if they have a membership card:
    // Age &lt; 18: 10% discount.
    // Age 18-64:
    //o With membership: 20% discount.
    //o Without membership: 10% discount.
    // Age 65+: 30% discount.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        sc.nextLine();
        String hasCard=sc.nextLine();
        calculateDiscount(age,hasCard);
    }

    private static void calculateDiscount(int age, String hasCard) {
        int discount=0;
        if(age<18 && age>=0){
            discount=10;
        }else {
            if( age>=18 && age<=64){
                if(hasCard.equalsIgnoreCase("yes")){
                    discount=20;
                }else {
                    if(hasCard.equalsIgnoreCase("no")){
                        discount=10;
                    }
                }
            }else {
                if(age>=65 && age<130) {
                    discount = 30;
                }else {
                    System.out.println("Wrong input");
                }
            }
        }
        System.out.println(discount+"% discount");
    }

}
