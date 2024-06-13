import java.util.Scanner;

public class Task7MatrixDiagonalSum {
    //Write a program to find the sum of both diagonals in a square matrix.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = Integer.parseInt(sc.nextLine());
        int[][] matr1=new int[rows][rows];
        fillInMartix(sc, matr1);
        calkDiagonalsSum(matr1);
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
    public static void calkDiagonalsSum(int[][]matrix1) {
        int sum=0;
        for (int i = 0; i < matrix1.length ; i++) {
            for (int j = 0; j < matrix1[i].length ; j++) {
                if (i == j) {
                    sum+=matrix1[i][j];
                }
            }
        }
        System.out.println(sum+" 1");
        for (int i = 0; i <matrix1.length; i++) {
            for (int j = 0; j <matrix1.length ; j++) {
                if (j==matrix1.length-1-i && i == matrix1.length-1-j) {
                    sum+=matrix1[i][j];
                }
            }
        }
        System.out.println(sum);
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

