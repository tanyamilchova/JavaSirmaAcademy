import java.util.Scanner;

public class Task2FromNToZeroReversed {
    //Write a function that accepts a positive number n and prints the numbers from n to 1 in
    //reverse order (from largest to smallest).
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=Integer.parseInt(sc.nextLine());

        for (int i = num; i >=0 ; i--) {
            System.out.println(i);
        }

    }
}
