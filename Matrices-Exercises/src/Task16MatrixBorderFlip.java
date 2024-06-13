public class Task16MatrixBorderFlip {
    //3 3
    //1 2 3
    //4 5 6
    //7 8 9
    //
    //4 1 2
    //7 5 3
    //8 9 6
    //
    //4 4
    //0 1 0 0
    //0 0 0 1
    //1 0 0 0
    //0 1 0 0
    //
    //0 0 1 0
    //1 0 0 0
    //0 0 0 1
    //1 0 0 0
    public static void main(String[] args) {
        int[][]arr={
                {1,2,3},
                {4,0,6},
                {7,8,9}
        };
        int rows=3;
        int cols=3;
        for (int i = 0; i < arr.length; i++) {
            int tempFirst=arr[i][0];
            int tempLast=arr[arr.length-2][arr.length-1];
            if(i==0 ) {
             tempFirst=arr[i][0];
             tempLast=arr[i][arr.length-1];
                System.out.print(arr[1][0]);
            for (int j = 0; j < arr.length-1; j++) {
                System.out.print(arr[i][j]);
            }

            }else {
                System.out.println();
                if(i==arr.length-1){
                    for (int j = 1; j < arr.length; j++) {
                        System.out.print(arr[i][j]);
                    }
                    System.out.print(tempLast);
                }
                else {
                    for (int j = 0; j < arr.length; j++) {
                        if(j==0 || j==arr.length-1) {
                            System.out.print(arr[i + 1][j]);
                        }else {
                            System.out.print(arr[i][j]);
                        }
                    }
                }
            }
        }
    }
}

