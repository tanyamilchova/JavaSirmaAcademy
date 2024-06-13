import java.util.Scanner;

public class Task40Staircase {
//Input: A positive integer &#39;n&#39; representing the number of steps.
// {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rows = Integer.parseInt(sc.nextLine());
    drawAHourglass(rows);
    }

    private static void drawAHourglass(int rows) {
        int stairs=1;
        int spaces=-1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stairs; j++) {
                System.out.print("#");
            }
            stairs++;
            spaces++;
            System.out.println();
        }
    }
}
