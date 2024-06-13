import java.util.Scanner;

public class Task28PyramideOfNumbers {
    //Write a function that takes an integer n and prints a pyramid of numbers as in the
    //examples:
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=Integer.parseInt(sc.nextLine());
        drawAPyramide(num);
    }

    private static void drawAPyramide(int num) {
        int start=0;
        int cols=1;
        boolean compleated=false;
        for (int i = start; i < num; i++) {
            for (int j = 0; j < cols; j++) {
                start++;
                System.out.print(start);
                if(start==num){
                   compleated=true;
                   break;
                }
            }
            if(compleated){
                break;
            }
            System.out.println();
            cols++;
        }
    }
}
