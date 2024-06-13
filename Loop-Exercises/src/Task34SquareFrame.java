import java.util.Scanner;

public class Task34SquareFrame {
    //Write a program that reads a positive integer n and draws a square frame of size n as
    //in the examples below:
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
    //3 + - +
    //| - |
    //+ - +
    //
    //4 + - - +
    //| - - |
    //| - - |
    //+ - - +
    //
    //5 + - - - +
    //| - - - |
    //| - - - |
    //| - - - |
    //+ - - - +
    //
    //6 + - - - - +
    //| - - - - |
    //| - - - - |
    //| - - - - |
    //| - - - - |
    //+ - - - - +
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int rows = Integer.parseInt(sc.nextLine());
        drawASquareFrame(rows);
    }

    private static void drawASquareFrame(int rows) {
        for (int i = 0; i < rows; i++) {
            if(i==0 || i==rows-1){
                System.out.print("+");
                for (int j = 0; j < rows-2; j++) {
                    System.out.print("-");
                }
                System.out.print("+");
                System.out.println();
            }else {
                System.out.print("|");
                for (int j = 0; j < rows-2; j++) {
                    System.out.print("+");
                }
                System.out.println("|");
            }
        }
    }
}
