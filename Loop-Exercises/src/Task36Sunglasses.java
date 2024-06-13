import java.util.Scanner;

public class Task36Sunglasses {
    //Write a program that reads an integer n (3 ≤ n ≤ 100) and prints sunglasses of size
    //5*n x n as in the examples:
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int rows = Integer.parseInt(sc.nextLine());
        validateInp(rows,sc);
        drawASunglasses(rows);
    }

    private static void drawASunglasses(int rows) {
        int item=(5*rows-rows)/2;
        for (int i = 0; i < rows; i++) {
            if(i==0 || i== rows-1) {
                for (int j = 0; j < item; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < rows; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < item; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }else {
                System.out.print("*");
                for (int j = 0; j < item - 2; j++) {
                    System.out.print("/");
                }
                System.out.print("*");

                if(rows%2==0) {
                    if (i == rows / 2-1) {
                        for (int j = 0; j < rows; j++) {
                            System.out.print("|");
                        }
                    } else {
                        for (int j = 0; j < rows; j++) {
                            System.out.print(" ");
                        }
                    }
                }else {
                    if (i == rows / 2) {
                        for (int j = 0; j < rows; j++) {
                            System.out.print("|");
                        }
                    } else {
                        for (int j = 0; j < rows; j++) {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.print("*");
                for (int j = 0; j < item - 2; j++) {
                    System.out.print("/");
                }
                System.out.print("*");
                System.out.println();
            }
        }

    }
    public static void validateInp(int item,  Scanner sc) {
        while (item < 3 || item > 100) {
            System.out.println("The value  " + item + " have to be in range-0 - 1000" );
            item = Integer.parseInt(sc.nextLine());
        }
    }
}
