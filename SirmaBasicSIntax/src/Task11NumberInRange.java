import java.util.Scanner;

public class Task11NumberInRange {

    //Write a program that checks whether the received number is in the range [-100, 100]
    //and is different from 0 and outputs &quot;Yes&quot; if it meets the conditions, or &quot;No&quot; if it is outside
    //them.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        checkNumInRange(num);
    }

    private static void checkNumInRange(int num) {
        if(num>=-100 && num<=100 && num!=0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
