import java.util.Scanner;

public class Task4SumMatrixElements {
    //Write a program that reads a matrix from the console and prints:
    // The count of rows
    // The count of columns
    // The sum of all matrix&#39;s elements
    //On the first line, you will get the matrix dimensions in the format &quot;{rows, columns}&quot;.
    //On the next lines, you will get the elements for each row separated by a comma.
    //Examples
    //Input Output
    //
    //e: office@sirma.bg a: 135 Tsarigradsko Shosse, blvd.
    //m: +359 2 9768310 1784 Sofia, Bulgaria
    //
    //sirma.com
    //3 6
    //7 1 3 3 2 1
    //1 3 9 8 5 6
    //4 6 7 9 1 0
    //
    //3
    //6
    //76
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String rowsCols = sc.nextLine();
        int rows = Integer.parseInt(rowsCols.split(" ")[0]);
        int cols = Integer.parseInt(rowsCols.split(" ")[1]);
        System.out.println(rows);
        System.out.println(cols);
        int[][] matr1=new int[rows][cols];

        fillInMartix(sc, matr1);

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
        int sum = 0;
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                sum += matrix1[i][j];
            }
        }
            return sum;
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

