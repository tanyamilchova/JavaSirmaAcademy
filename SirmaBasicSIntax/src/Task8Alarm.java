import java.util.Scanner;

public class Task8Alarm {
    //8. Alarm after 15 minutes
    //
    //Write a function that takes an hour and minutes of a 24-hour day and calculates what
    //time it will be after 15 minutes. Print the result in hours: minutes format.
    //Hours are always between 0 and 23, and minutes are always between 0 and 59. Hours
    //are written in one or two digits.
    //Minutes are always written with two digits, with a leading zero when necessary.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        int minutes = sc.nextInt();
        getTime(hours,minutes);
    }
    public static void getTime(int hours,int minutes){
        int period=90;
        hours=hours+(minutes+period)/60;
        minutes=(minutes+period)%60;

        String time=String.format("%02d:%02d",hours,minutes);
        System.out.println(time);
    }
}
