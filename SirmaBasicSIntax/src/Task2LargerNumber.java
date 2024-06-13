import java.util.Scanner;

public class Task2LargerNumber {
    //Write a function that reads accepts two integers and prints the larger of the two.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int firstNum=sc.nextInt();
        int secondNum=sc.nextInt();
        System.out.println(Math.max(firstNum,secondNum));
    }
}
