import java.util.Scanner;

public class Task4From1ToNThroughM {
    //Write a function that takes two numbers n and m and prints the numbers from 1 to n
    //through m (with step m).
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=Integer.parseInt(sc.nextLine());
        int m=Integer.parseInt(sc.nextLine());
        for (int i = 0; i <num ; i+=m) {
            System.out.println(i+1);
        }
    }
}
