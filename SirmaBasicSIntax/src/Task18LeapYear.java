import java.util.Scanner;

public class Task18LeapYear {
    //Write a console program that takes a year as input and tells the user if it&#39;s a leap year or not.
    //Note: A leap year is divisible by 4. However, years divisible by 100 are not leap years, unless
    //they are also divisible by 400.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        checkLeapYear(year);
    }

    private static void checkLeapYear(int year) {
        boolean leap=false;
        if((year%4==0 && year%100!=0 )||year%400==0) {
            leap=true;
            System.out.println("I's a leap year");
        }else {
            System.out.println("Not a leap year!");
        }

    }
}
