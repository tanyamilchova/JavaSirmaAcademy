import java.util.Scanner;

public class Task5DayOfWeek {
    //5. Day of the week
    //
    //Write a function that receives an integer and prints a day of the week (in English), within
    //the limits [1...7] or prints &quot;Error&quot; in case the entered number is invalid.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        getDayOfWeek(num);
    }
    public static void getDayOfWeek(int num){
        switch (num){
            case 1-> System.out.println("Monday");
            case 2-> System.out.println("Tuesday");
            case 3-> System.out.println("Wednesday");
            case 4-> System.out.println("Thursday");
            case 5-> System.out.println("Friday");
            case 6-> System.out.println("Saturday");
            case 7-> System.out.println("Sunday");
            default-> System.out.println("Error");
        }
    }
}
