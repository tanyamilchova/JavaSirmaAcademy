import java.util.Scanner;

public class Task37HpusePattern {
    //Input: A positive odd integer &#39;n&#39; representing the height of the house.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = Integer.parseInt(sc.nextLine());
        drawAHousePattern(rows);
    }

    private static void drawAHousePattern(int rows) {

        int start=1;
        int spaces=rows-2-1;

        for (int i = 0; i < rows; i++) {
            if(i>=rows-2){
                System.out.print("*");
                for (int j = 0; j <(rows-2)*2-1-2 ; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }else {
                for (int j = 0; j < spaces; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < start; j++) {
                    System.out.print("*");
                }
                start+=2;
                spaces--;
                System.out.println();
            }
        }
    }
}
