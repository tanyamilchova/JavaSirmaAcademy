import java.util.Scanner;

public class Task16HollowRectanglePattern {
    //Input: Two positive integers &#39;n&#39; and &#39;m&#39; representing the number of rows and columns.
    //******
    //*    *
    //*    *
    //******
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=Integer.parseInt(sc.nextLine());
        int colmns=Integer.parseInt(sc.nextLine());
        drawAHollowRectangle(rows,colmns);
    }

    private static void drawAHollowRectangle(int rows, int colmns) {
        for (int i = 0; i < colmns; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < rows - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < colmns - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int i = 0; i < colmns; i++) {
            System.out.print("*");
        }
    }
}
