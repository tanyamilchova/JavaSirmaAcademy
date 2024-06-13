public class Task12RotateMatrix90Degrees {
    //Rotate the given matrix 90 degrees to the right (or clockwise).
    //Input Output
    //3 3
    //1 2 3
    //4 5 6
    //7 8 9
    //
    //7 4 1
    //8 5 2
    //9 6 3
    public static void main(String[] args) {
        int[][]arr={
                {1,2,3},
                {4,0,6},
                {7,8,9}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int el=arr[arr.length-1-j][i];
                System.out.print(el);
            }
            System.out.println();
        }
    }
}
