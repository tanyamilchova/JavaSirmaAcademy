public class Task21Snowflakes {
    //Generate every state of a given matrix, where “*” represents a snowflake, falling on the
    //ground. “0” is empty space and the “#” is a barrier, which cannot move.
    //Print every state until all flakes cannot fall anymore.
    //1
    //Input Output
    //3 3
    //* 0 *
    //0 0 0
    //0 0 0
    //
    //0 0 0
    //* 0 *
    //0 0 0
    //===
    //0 0 0
    //0 0 0
    //* 0 *
    public static void main(String[] args) {
        int rows=3;
        char[][]arr={
                {'*','0','*'},
                {'0','0','0'},
                {'#','0','0'},
        };
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]=='*') {
                    if (arr[i + 1][j] == '0') {
                        arr[i][j]='0';
                        arr[i+1][j]='*';
                    }
                    printMartix(arr);
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
    public static void printMartix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
