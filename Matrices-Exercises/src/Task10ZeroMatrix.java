import java.util.Arrays;

public class Task10ZeroMatrix {
    //If an element in a matrix is 0, set its entire row and column to 0.
    //Input Output
    //3 3
    //1 2 3
    //4 0 6
    //7 8 9
    //
    //1 0 3
    //0 0 0
    //7 0 9
    public static void main(String[] args) {
        int[][]arr={
                {1,2,3},
                {4,0,6},
                {7,8,9}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==0){
                    for (int k = 0; k < arr[i].length; k++) {
                        arr[i][k]=0;
                    }
                }
            }
        }
       printMartix(arr);
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
