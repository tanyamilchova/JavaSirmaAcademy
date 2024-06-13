import java.util.Scanner;

public class Task44AlternativeConditions {

    //Sample input:
    //input output
    //7
    //    1
    //  2 3
    //4 5 6
    //    7

    //7
    //     1
    //   2 3
    // 4 5 6
    //7
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = Integer.parseInt(sc.nextLine());
        drawAlternativeConditions(rows);
    }

    private static void drawAlternativeConditions(int num) {
        int row=findRows(num);
        int spaces=row-1;
        int start=1;
        int cols=1;
        boolean isTarget=false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < cols; j++) {
                System.out.print(start++);
                if(start>num){
                    isTarget=true;
                    break;
                }
            }
            if(isTarget){
                break;
            }
            spaces--;
            cols++;
            System.out.println();
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
