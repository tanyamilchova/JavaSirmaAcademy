import java.util.Scanner;

public class Task3FromOneToNThrough2 {
    //Write a program that accepts a number n and prints the numbers from 1 to n through 2
    //(with step 2).
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=Integer.parseInt(sc.nextLine());
        for (int i = 0; i <num ; i+=2) {
            System.out.println(i+1);
        }
    }
}
