import java.util.Scanner;

public class Task31HalfRhombusOfAsterisks {
    //Write a program that accepts a positive integer n and prints a rhombus of asterisks of size
    //n as in the examples below:
    //Sample input:
    //input output
    //1 *
    //2 *
    //* *
    //*
    //3 *
    //* *
    //* * *
    //* *

    //*
    //4 *
    //* *
    //* * *
    //* * * *
    //* * *
    //* *
    //*
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=Integer.parseInt(sc.nextLine());
        drawAHalfRhombus(num);
    }

    private static void drawAHalfRhombus(int num) {
        int start=1;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < start; j++) {
                System.out.print("*");
            }
            start++;
            System.out.println();
        }
        start-=2;
        for (int i = 0; i < num-1; i++) {
            for (int j = 0; j < start; j++) {
                System.out.print("*");
            }
            start--;
            System.out.println();
        }

    }
}
