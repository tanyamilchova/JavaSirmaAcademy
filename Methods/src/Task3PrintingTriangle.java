import java.util.Scanner;

public class Task3PrintingTriangle {
    //Create a method for printing triangles as shown below:
    //1
    //1 2
    //1 2 3
    //1 2
    //1
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=Integer.parseInt(sc.nextLine());
        printTriangle(rows);

    }

    private static void printTriangle(int rows) {

        int midRow;
        if(rows%2==0){
            midRow=rows/2;
        }else {
            midRow=rows/2+1;
        }

        int start=1;
        int cols=1;
        for (int i = 0; i < midRow; i++) {
             start=1;
            for (int j = 0; j < cols; j++) {
                System.out.print(start++);
            }
            System.out.println();
            cols++;
        }
       cols-=2;
        for (int i = 0; i < midRow - 1; i++) {
            start=1;
            for (int j = 0; j <cols ; j++) {
                System.out.print(start++);
            }
            System.out.println();
            cols--;
        }

    }
}
