import java.util.Arrays;
import java.util.Scanner;

public class Task15LastKNumSequence {
    //You are given two integers n and k. Write a program that generates and prints the following
    //sequence:
    // The first element is 1
    // Every following element equals the sum of the previous k elements
    // The length of the sequence is n elements
    //
    //The input comes as two number arguments. The first element represents the number n, and
    //the second – the number k.
    //The output is printed on the console on a single line, separated by space.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=Integer.parseInt(sc.nextLine());
        int k=Integer.parseInt(sc.nextLine());
        int start=1;
        int sum=0;

        int []helpArr=new int[length];
        helpArr[0]=start;
        for (int i = 1; i < length; i++) {
            if (i <= k) {
              sum+=helpArr[i-1];
              helpArr[i]=sum;
            }else {
                sum+=helpArr[i-1]-helpArr[i-k-1];
                helpArr[i]=sum;
            }
        }
        System.out.println(Arrays.toString(helpArr));
    }
}
