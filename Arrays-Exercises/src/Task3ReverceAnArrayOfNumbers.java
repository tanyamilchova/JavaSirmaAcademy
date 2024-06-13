import java.util.Arrays;
import java.util.Scanner;

public class Task3ReverceAnArrayOfNumbers {
    //1. Sum First and Last Array Element
    //
    //Write a function that receives an array of strings and prints the sum of the first and last
    //element in that array.
    public static void main(String[] args) {
        int[]arr={10,20,30,40,50};
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        if(number>0 && number <arr.length){
            int[]newArr=new int[number];
            int start=0;
            for (int i = number-1; i >=0 ; i--) {
                newArr[start]=arr[i];
                start++;
            }
            System.out.println(Arrays.toString(newArr));
        }
    }
}
