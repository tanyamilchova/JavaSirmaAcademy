import java.util.Scanner;

public class Task33TreePattern {
    //Input: A positive integer &#39;n&#39; representing the height of the tree.
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int rows = Integer.parseInt(sc.nextLine());
        drawATree(rows);
    }

    private static void drawATree(int rows) {
        int start=1;
        int spaces=rows-1;
        for (int i = 0; i < rows+1; i++) {
            if(i==rows){
                for (int j = 0; j <rows-1 ; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }else {
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
        }
    }
}
