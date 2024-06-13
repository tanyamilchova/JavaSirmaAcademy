public class Task1 {
    //Write a program that reads two integer matrices (2D arrays) from the console and
    //compares them element by element.
    //Each matrix contain a line with a positive integer number R – the number of rows in the
    //matrix and C – the number of columns – followed by R lines containing the C numbers,
    //separated by spaces (each line will have an equal amount of numbers).
    //Print &quot;equal&quot; if the matrices match and &quot;not equal&quot; if they don&#39;t match.
    //Input Output
    //2 3
    //1 2 3
    //
    //equal
    //
    //e: office@sirma.bg a: 135 Tsarigradsko Shosse, blvd.
    //m: +359 2 9768310 1784 Sofia, Bulgaria
    //
    //sirma.com
    //2 1 3
    //2 3
    //1 2 3
    //2 1 3
    public static void main(String[] args) {
        boolean isEqual=true;
        int[][]matr1={
                {2,3},
                {1,2,3},
                {2,1,3}
        };
        int[][]matr2={
                {2,3},
                {1,2,3},
                {2,1,3}
        };
        for (int i = 0; i < matr1.length; i++) {
            for (int j = 0; j < matr1[i].length; j++) {
                if (matr1[i][j]!=matr2[i][j]){
                    isEqual=false;
                    break;
                }
            }
        }
        System.out.println(isEqual);
    }
}
