import java.util.Arrays;
import java.util.Scanner;

public class Task2MatrixAddition {
    //Given two matrices of the same size, write a program to add them together.
    //First read 2 integers separated by whitespace (rows and cols of the matrices), next read
    //the matrices.
    //Print new matrix with the sum of the sum of the same indices from the two matrices.
    //Input Output
    //2 2
    //1 2
    //3 4
    //2 2
    //2 2
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String rowsCols = sc.nextLine();
        String rows = rowsCols.split(" ")[0];
        String cols = rowsCols.split(" ")[1];
        System.out.println(rows);
        System.out.println(cols);

        int[][] matr1 = new int[Integer.parseInt(rows)][Integer.parseInt(cols)];
        int[][] matr2 = new int[Integer.parseInt(rows)][Integer.parseInt(cols)];
        fillInMartix(sc, matr1);
        fillInMartix(sc, matr2);
        doAddition(matr1,matr2);
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
    public static void doAddition(int[][]matrix1,int[][]matrix2){

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j]+matrix2[i][j]+" ");
            }
            System.out.println();
        }
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