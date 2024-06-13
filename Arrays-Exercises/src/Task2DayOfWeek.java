import java.util.Scanner;

public class Task2DayOfWeek {
    //1. Sum First and Last Array Element
    //
    //Write a function that receives an array of strings and prints the sum of the first and last
    //element in that array.
    public static void main(String[] args) {
        String[]arr={"Wednesday","Saturday","Sunday"};
        Scanner sc=new Scanner(System.in);
        int position=Integer.parseInt(sc.nextLine());
        if(position>0 && position<arr.length) {
            System.out.println(arr[position]);
        }else {
            System.out.println("Invalid day");
        }
    }
}
