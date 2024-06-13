import java.util.Scanner;

public class Task6PrintDiagonals {
    //Write a program that reads a matrix from the console. Then print the diagonals. The
    //matrix will always be square. On the first line, you read a single integer N the matrix size.
    //Then on each line N elements. The first diagonal should always start with the element at
    //the first row and col. The second diagonal should start with the element at the last row
    //and first col.
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int rows = Integer.parseInt(sc.nextLine());

        int[][] matr1=new int[rows][rows];

        fillInMartix(sc, matr1);
//        printMartix(matr1);
        printMainDiagonal(matr1);

    }

    public static void fillInMartix(Scanner sc, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            String row = sc.nextLine();
            String[] arrRow = row.split(" ");
            for (int j = 0; j < arrRow.length; j++) {
                int j0 = Integer.parseInt(arrRow[j]);
                matrix[i][j] = j0;
            }
        }
    }
    public static void printMainDiagonal(int[][]matrix1) {

        for (int i = 0; i < matrix1.length ; i++) {
            for (int j = 0; j < matrix1[i].length ; j++) {
                if (i == j) {
                    System.out.print(matrix1[i][j]+" ");
                }
            }
        }
        System.out.println();
        for (int i = matrix1.length-1; i >= 0; i--) {
            for (int j = matrix1.length-1; j >= 0 ; j--) {
                if (j==matrix1.length-1-i && i == matrix1.length-1-j) {
                    System.out.print(matrix1[i][j]+" ");
                }
            }
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


