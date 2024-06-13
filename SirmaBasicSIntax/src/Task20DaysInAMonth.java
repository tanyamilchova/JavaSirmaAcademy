import javax.print.attribute.standard.Finishings;
import java.util.Scanner;

public class Task20DaysInAMonth {
//Write a console program that takes a month number (1 to 12) as input and outputs the
//number of days in that month. Assume it&#39;s not a leap year.
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int month=sc.nextInt();
    getDaysInAMonth(month);
}

    private static void getDaysInAMonth(int month) {
       int days=0;
        switch (month){
            case 1,3,5,7,8,10,12->days=31;
            case 4,6,9,11->days=30;
            case 2->days=28;
        }
        System.out.println(days);
    }
}
