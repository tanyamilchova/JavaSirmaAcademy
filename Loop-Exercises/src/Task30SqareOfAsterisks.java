import java.util.Scanner;

public class Task30SqareOfAsterisks {
    //Write a function that takes a number n and draws a square of n * n asterisks. Between
    //each two asterisks there is a whitespace.
    //Sample input:
    //input output
    //2 * *
    //  * *
    //3 * * *
    // * * *
    // * * *
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=Integer.parseInt(sc.nextLine());
        drawAsqareOfAsterisks(num);
    }

    private static void drawAsqareOfAsterisks(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
