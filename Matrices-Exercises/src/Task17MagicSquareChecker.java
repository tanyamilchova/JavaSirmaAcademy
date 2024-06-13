public class Task17MagicSquareChecker {
    //Determine if a matrix is a magic square (a matrix in which the sums of every row,
    //every column, and both main diagonals are the same).
    //
    //Input Output
    //3 3
    //1 2 3
    //4 5 6
    //7 8 9
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        int leftDiag = 0;
        int rigthDiag = 0;
        boolean isMagic=true;

        int[][] arr = {
                {1, 0, 0, 0},
                {0, 0, 0, 1},
                {0, 1, 0, 0},
                {0, 0, 1, 0}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    rigthDiag += arr[i][j];
                } else {
                    if (i + j == arr.length - 1) {
                        leftDiag += arr[i][j];
                    }
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                rowSum += arr[i][j];
                colSum += arr[j][i];
            }

            if (rowSum != leftDiag || rowSum != rigthDiag ||
                    colSum != leftDiag || colSum != rigthDiag) {
                System.out.println("False");
                isMagic=false;
                break;
            }
        }
        if(isMagic){
            System.out.println("True");
        }
    }
}

