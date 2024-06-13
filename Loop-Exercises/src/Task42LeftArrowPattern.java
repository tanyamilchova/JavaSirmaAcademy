import java.util.Scanner;

public class Task42LeftArrowPattern {
    //Draw a left arrow pattern:
    //Inpu
    //t
    //Output
    //5 *
    //**
    //***
    //****
    //***
    //**
    //*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = Integer.parseInt(sc.nextLine());
        drawALeftArrowPattern(rows);
    }

    private static void drawALeftArrowPattern(int rows) {
        int stars=1;
        int row1=rows-1;
        int row2=rows-2;
        int spaces1=row1-1;
        int spaces2=1;
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < spaces1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            spaces1--;
            stars++;
            System.out.println();
        }
        stars-=2;
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < spaces2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            spaces2++;
            stars--;
            System.out.println();

        }
    }
}
