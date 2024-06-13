import java.util.Scanner;

public class Task5MaxSumOfTwoSubMatrix {
    //Write a program that reads a matrix from the console. Then find the biggest sum of a
    //2x2 submatrix. Print the submatrix and its sum.
    //On the first line, you will get the matrix dimensions in the format &quot;{rows, columns}&quot;.
    //On the next lines, you will get the elements for each row separated by a comma.
    //Input Output
    //3 6
    //7 1 3 3 2 1
    //1 3 9 8 5 6
    //4 6 7 9 1 0
    //
    //33
    //9 8
    //7 9
    //
    //2 4
    //10 11 12 13
    //14 15 16 17
    //
    //58
    //12 13
    //16 17
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String rowsCols = sc.nextLine();
        int rows = Integer.parseInt(rowsCols.split(" ")[0]);
        int cols = Integer.parseInt(rowsCols.split(" ")[1]);
        System.out.println(rows);
        System.out.println(cols);
        int[][] matr1=new int[rows][cols];

        fillInMartix(sc, matr1);
printMartix(matr1);
        int sum= makeIntersection(matr1);
        System.out.println(sum);
    }

    public static int[][] fillInMartix(Scanner sc, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            String row = sc.nextLine();
            String[] arrRow = row.split(" ");
            for (int j = 0; j < arrRow.length; j++) {
                int j0 = Integer.parseInt(arrRow[j]);
                matrix[i][j] = j0;
            }
        }
        return matrix;
    }
    public static int makeIntersection(int[][]matrix1) {
        int max = 0;
        int tempSum=0;
        for (int i = 0; i < matrix1.length-1; i++) {
            for (int j = 0; j < matrix1[i].length-1; j++) {
              tempSum=0;
              tempSum=tempSum+ matrix1[i][j]+matrix1[i][j+1]+matrix1[i+1][j]+matrix1[i+1][j+1];
              if(max<tempSum){
                  max=tempSum;
              }
            }
        }
        return max;
    }
    public static void printMartix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

