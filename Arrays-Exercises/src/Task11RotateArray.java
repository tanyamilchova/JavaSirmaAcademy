import java.util.Arrays;

public class Task11RotateArray {
    //The array should be rotated to the right side, meaning that the last element should become
    //the first, upon rotation.
    //You receive an array of strings and count of rotation you need to perform.
    //The output is the resulting array after the rotations. The elements should be printed on one
    //line, separated by a single space.
    //Examples
    //Input Output
    //1,2,3,4
    //2
    //
    //3 4 1 2

    //Banana,Orange,Coconut,Apple
    //15
    public static void main(String[] args) {
//        String str= "1,2,3,4";
        String str="Banana,Orange,Coconut,Apple";
        String[] arr=str.split(",");
        int n=15;
        if(arr.length>0) {
            for (int k = 0; k < n; k++) {
                String start = arr[0].trim();
                String end = arr[arr.length - 1].trim();
                for (int i = 1; i < arr.length; i++) {
                    String current = arr[i].trim();
                    arr[i] = start;
                    start = current;
                }
                arr[0] = end;
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
