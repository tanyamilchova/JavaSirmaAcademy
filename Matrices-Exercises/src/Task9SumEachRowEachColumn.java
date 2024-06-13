public class Task9SumEachRowEachColumn {
    //Given a matrix, calculate the sum of each row and each column.
    //Input Output
    //3 2
    //1 2
    //3 4
    //5 6
    //
    //Row Sums: 3, 7, 11
    //Column Sums: 9, 12
    public static void main(String[] args) {
        int rows=3;
        int cols=2;
        int[][]arr={
                {1,2},
                {3,4},
                {5,6}
        };
        String rowResult="Row Sums:";
        String colResult="Col Sums:";
        int rowSum = 0;

        for (int i = 0; i < arr.length; i++) {
             rowSum = 0;
             for (int j = 0; j < arr[i].length; j++) {
                rowSum += arr[i][j];
            }
            if (i != arr.length - 1) {
                rowResult = rowResult.concat(rowSum + ", ");
            } else {
                rowResult = rowResult.concat(rowSum + "");
            }
        }
        System.out.println(rowResult);

        int colSum = 0;
        for (int i = 0; i < cols; i++) {
            colSum=0;
            for (int j = 0; j < rows; j++) {
                colSum+=arr[j][i];
            }
            if (i != cols - 1) {
                colResult = colResult.concat(colSum + ", ");
            }else {
                colResult = colResult.concat(colSum + "");
            }
        }
        System.out.println(colResult);
    }
}
