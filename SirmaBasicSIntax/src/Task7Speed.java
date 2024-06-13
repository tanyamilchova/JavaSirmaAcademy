import java.util.Scanner;

public class Task7Speed {
    //Write a program that receives speed (real number) and prints speed information.
    //• At speeds up to 10 (inclusive) print &quot;slow&quot;.
    //• At speeds above 10 and up to 60 print &quot;average&quot;.
    //• At speeds above 60 and up to 120, print &quot;fast&quot;.
    //• At speeds above 120 and up to 160, print &quot;super-fast&quot;.
    //• At higher speeds, print &quot;turbo-fast&quot;.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int speed=sc.nextInt();
        getSpeedInfo(speed);
    }
    public static void getSpeedInfo(int speed){
        if(speed<=10){
            System.out.println("slow");
        }else {
            if(speed>10 && speed<=60){
                System.out.println("average");
            }
            else {
                if(speed>60 && speed<=120){
                    System.out.println("fast");
                }else {
                    if(speed>120 &&speed<140){
                        System.out.println("super");
                    }else {
                        System.out.println("turbo");
                    }
                }
            }
        }
    }
}
