import java.util.Scanner;

public class Task38PyramideWithIncreasingDigits {
    //Input: A positive integer &#39;n&#39; representing the number of rows.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = Integer.parseInt(sc.nextLine());
        drawAPyramideIncrDigits(rows);
    }

    private static void drawAPyramideIncrDigits(int rows) {

        int columns=1;
        int spaces=rows-1;
        for (int i = 0; i < rows; i++) {
            int start=i+1;
            for (int j = 0; j <spaces ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < columns; j++) {
                System.out.print(start++);
            }
             start-=2;
            for (int j = 0; j < columns - 1; j++) {
                System.out.print(start--);
            }
            columns++;
            spaces--;
            System.out.println();
        }
    }
}
