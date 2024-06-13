import java.util.Scanner;

public class Task39ArrowPattern {
    //Input: A positive integer &#39;n&#39; representing the number of rows.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = Integer.parseInt(sc.nextLine());
        drawAnArrowPattern(rows);
    }

    private static void drawAnArrowPattern(int rows) {
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
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows/2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <rows ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

