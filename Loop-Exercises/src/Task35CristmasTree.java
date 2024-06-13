import java.util.Scanner;

public class Task35CristmasTree {
    //Write a program that receives a number n (1 ≤ n ≤ 100) and prints a Christmas tree
    //of size n as in the examples below:
    //Inpu
    //t
    //Outpu
    //t
    //
    //Inpu
    //t
    //Output Inpu
    //t
    //Output Inpu
    //t
    //Output
    //
    //1 |
    //* | *
    //
    //2 |
    //* | *
    //** | **
    //
    //3 |
    //* | *
    //** | **
    //*** | ***
    //
    //4 |
    //* | *
    //** | **
    //*** | ***
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = Integer.parseInt(sc.nextLine());
        drawACristmasTree(rows);
    }

    private static void drawACristmasTree(int rows) {
        int stars=0;
        int spaces=rows;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.print(" | ");
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            stars++;
            spaces--;
        }
    }
}
