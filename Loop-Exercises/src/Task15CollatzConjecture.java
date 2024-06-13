import java.util.Scanner;

public class Task15CollatzConjecture {
    //Write a program that receives a positive integer &#39;n&#39; and calculates and prints the Collatz
    //sequence for &#39;n&#39;. The Collatz sequence is defined as follows:
    // If &#39;n&#39; is even, divide it by 2.
    // If &#39;n&#39; is odd, multiply it by 3 and add 1.
    // Repeat the process until &#39;n&#39; becomes 1.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=Integer.parseInt(sc.nextLine());
        printCollazSequence(num);
    }
    private static void printCollazSequence(int num) {
        while (num>=1) {
            System.out.println(num);
            if(num==1){
                break;
            }
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num =(num*3)+1;
            }
        }
    }
}
