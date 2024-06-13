public class Task20MaximalSum {
    //Write a program that reads a rectangular integer matrix of size N x M and finds the
    //square 3 x 3 with a maximal sum of its elements.
    // On the first line, you will receive the rows N and columns M.
    // On the next N lines, you will receive each row with its elements.
    //Print the elements of the 3 x 3 square as a matrix, along with their sum. See the format
    //of the output below.
    //Input Output
    //4 5
    //1 5 5 2 4
    //2 1 4 14 3
    //3 7 11 2 8
    //4 8 12 16 4
    //
    //Sum = 75
    //1 4 14
    //7 11 2
    //8 12 16
    public static void main(String[] args) {
        int rows = 4;
        int cols = 5;
        int squareNum=3;
        int sum=0;
        int[][] arr = {
                {1, 5, 5,2,4},
                {2, 1, 4, 14,3},
                {3, 7, 11,2,8},
                {4,8,12,16,4}
        };
        int sumMatrix=0;
        for (int i = 0; i < arr.length-squareNum+1; i++) {
            for (int j = 0; j < arr[i].length-squareNum+1; j++) {
                int tempSum=0;
                tempSum=tempSum+arr[i][j]+arr[i][j+1]+arr[i][j+2]+
                        arr[i+1][j]+arr[i+1][j+1]+arr[i+1][j+2]+
                        arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                if(sumMatrix<tempSum){
                    sumMatrix=tempSum;
                }
                System.out.println(tempSum);
            }
        }
        System.out.println(sumMatrix);
    }
}
