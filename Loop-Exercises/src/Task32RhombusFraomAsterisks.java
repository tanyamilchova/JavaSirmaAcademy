import java.util.Scanner;

public class Task32RhombusFraomAsterisks {
    //32. Rhombus from asterisks
    //
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


        Scanner sc = new Scanner(System.in);
        int rows = Integer.parseInt(sc.nextLine());
        drawARhombus(rows);
    }

    private static void drawARhombus(int rows) {
        int start=1;
        int spaces=rows-1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < start; j++) {
                System.out.print("* ");
            }
            start++;
            spaces--;
            System.out.println();
        }
        spaces=1;
        start-=2;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < start; j++) {
                System.out.print("* ");
            }
            spaces++;
            start--;
            System.out.println();
        }
    }
}
