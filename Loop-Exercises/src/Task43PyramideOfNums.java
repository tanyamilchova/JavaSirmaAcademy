import java.util.Scanner;

public class Task43PyramideOfNums {
    //Write a function that takes an integer n and prints a pyramid of numbers, as in the
    //examples:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = Integer.parseInt(sc.nextLine());
        drawAPyrNums(rows);
    }

    private static void drawAPyrNums(int num) {
        int row=findRows(num);
        int cols=1;
        int start=1;
        boolean isTarget=false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <cols ; j++) {
                System.out.print(start++);
                if(start>num){
                    isTarget=true;
                    break;
                }
            }
            cols++;
            System.out.println();
            if(isTarget){
                break;
            }
        }
    }
    public static int findRows(int num){
        int countRows=0;
        int start=1;
        while (num>0){
            num-=start;
            countRows++;
            start++;
        }
        return countRows;
    }
}
