public class Task11MatrixBoundarySum {
    //Write a program that calculates the sum of the boundary elements of a matrix.
    public static void main(String[] args) {
        int[][]arr={
                {1,2,3},
                {4,0,6},
                {7,8,9}
        };
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if( (i==0 || i== arr.length-1) || j==0 || j== arr.length-1){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
