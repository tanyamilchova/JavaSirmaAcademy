import java.util.Scanner;

public class Task3IntersectionOfTwoMatrix {
    //3. Intersection of Two Matrices
    //
    //Write a program that reads two char matrices (A[][] and B[][]) of the same order M *
    //N and prints the third matrix C[][], which is filled with the intersecting elements of A
    //and B, otherwise set the element to &#39;*&#39;. On the first two lines, you receive M and N, then
    //on 2 * M lines N characters – the matrices elements.
    //The matrix elements may be any ASCII char except &#39;*&#39;.
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String rows = sc.nextLine();
        String cols = sc.nextLine();
        System.out.println(rows);
        System.out.println(cols);

        String[][] matr1 = new String[Integer.parseInt(rows)][Integer.parseInt(cols)];
        String[][] matr2 = new String[Integer.parseInt(rows)][Integer.parseInt(cols)];
        fillInMartix(sc, matr1);
        fillInMartix(sc, matr2);
        String[][]matrix3= makeIntersection(matr1,matr2);
        printMartix(matrix3);
    }

    public static String[][] fillInMartix(Scanner sc, String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            String row = sc.nextLine();
            String[] arrRow = row.split(" ");
            for (int j = 0; j < arrRow.length; j++) {
                String j0 = arrRow[j];
                matrix[i][j] = j0;
            }
        }
        return matrix;
    }
    public static String[][] makeIntersection(String[][]matrix1, String[][]matrix2){
        String[][]matrix3=new String[matrix1.length][matrix1.length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                if(matrix1[i][j].equals(matrix2[i][j])){
                    matrix3[i][j]=matrix1[i][j];
                }else {
                    matrix3[i][j]="*";
                }
            }
            System.out.println();
        }
        return matrix3;
    }
    public static void printMartix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}