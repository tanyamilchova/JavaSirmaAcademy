import java.util.Scanner;

public class Task8FillTheMatrix {
    //Write two methods that fill a size N x N matrix in two different patterns. Both
    //patterns are described below:
    //Pattern A Pattern B
    //1 5 9 13
    //2 6 10 14
    //3 7 11 15
    //4 8 12 16
    //
    //1 8 9 16
    //2 7 10 15
    //3 6 11 14
    //4 5 12 13

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
        int count=1;
        for (int i = 0; i < matrix1[0].length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                matrix1[j][i]=count++;
            }
        }
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
        count=1;
        int[][]matrix3=new int[matrix1.length][matrix1.length];
//        for (int i = 0; i < matrix1[0].length; i++) {
//            for (int j = 0; j < matrix1.length; j++) {
//                if(i%2==0) {
//                    matrix1[j][i] = count++;
//                }else {
//                    matrix1[j][matrix1.length-1-i]=count++;
//                }
//            }
//        }
        for (int i = 0; i < matrix3.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix3.length; j++) {
                    matrix1[j][i] = count++;
                }
            } else {
                for (int j = matrix3.length - 1; j >= 0; j--) {
                    matrix1[j][i] = count++;
                }
            }
        }
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j]+" ");
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




