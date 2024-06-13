public class Task19CheckbaordPattern {
    //Given an n x n size, generate a matrix with a checkerboard pattern using 0s (for white
    //squares) and 1s (for black squares).
    //Input Output
    //3 0 1 0
    //1 0 1
    //0 1 0
    public static void main(String[] args) {
        int size=4;
        int[][]arr=new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(i%2==0 && j%2==0){
                    arr[i][j]=0;
                }else {
                    if((i%2==0 && j%2!=0) || (i%2!=0 && j%2==0)) {
                        arr[i][j] = 1;
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
