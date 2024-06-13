import java.util.Scanner;

public class Task19MovieTicketPrice {
    //Write a console program that determines the price of a movie ticket based on age:
    // Child (0-12 years): $5
    // Teen (13-19 years): $8
    // Adult (20+ years): $10
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        getPriceBasedOnAge(age);
    }

    private static void getPriceBasedOnAge(int age) {
        int price=0;
        if(age>=0 && age<=12){
            price=5;
        }else {
            if(age>=13 && age<=19){
                price=8;
            }else {
                if(age>=20 && age<=130){
                    price=10;
                }else {
                    System.out.println("Wrong input");
                }
            }
        }
        System.out.println("$"+price);
    }
}
