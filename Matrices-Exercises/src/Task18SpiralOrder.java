import java.util.Scanner;

public class Task18SpiralOrder {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows");
        int row=sc.nextInt();
        System.out.println("Enter columns");
        int cols=sc.nextInt();
        int[][]arr=new int[row][cols];

        int number=10;
        char direction='r';
        int i=0;
        int j=0;

        for (int m = 0; m < row*cols; m++) {
            arr[i][j]=number++;

            switch (direction) {
                case 'r':
                    j++;
                    break;
                case 'l':
                    j--;
                    break;
                case 'u':
                    i--;
                    break;
                case 'd':
                    i++;
                    break;
            }
            if(i<0 ||i== row || j<0 ||j==cols || arr[i][j]!=0){
                switch (direction){
                    case 'r':direction='d';
                        j--;
                        i++;
                        break;
                    case 'l':direction='u';
                        j++;
                        i--;
                        break;
                    case 'u':direction='r';
                        i++;
                        j++;
                        break;
                    case 'd':direction='l';
                        i--;
                        j--;
                        break;
                }
            }
        }
        for (int k = 0; k < arr.length; k++) {
            for (int l = 0; l < arr[i].length; l++) {
                System.out.print(arr[k][l]);
            }
            System.out.println();
        }
    }
}
