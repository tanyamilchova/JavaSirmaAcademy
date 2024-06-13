import java.util.Scanner;

public class Task6EvenOrOdd {
    //6. Even or odd
    //
    //Write a function that receives an integer and prints on the console, whether even or odd.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }
}
