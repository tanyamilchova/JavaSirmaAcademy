public class A {
    public static void main(String[] args) {
        int[][] arr = {
                {0,1,0,0},
                {0,0,0,1},
                {1,0,0,0},
                {0,0,1,0}
        };
        int[][] arrRight = {
                {0,1,0,0},
                {0,0,0,1},
                {1,0,0,0},
                {0,0,1,0}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(j<= arr.length-i-1){
                    arr[i][j]=5;
                }
            }
        }
        printMartix(arr);
        System.out.println();

        for (int i = 0; i < arrRight.length; i++) {
            for (int j = 0; j < arrRight[i].length; j++) {
                if(j<= i){
                    arrRight[i][j]=5;
                }
            }
        }
        printMartix(arrRight);
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
