import java.util.Scanner;

public class Task1SignOfInteger {
    //Create a method that prints the sign of an integer number.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
           int num=Integer.parseInt(sc.nextLine());
        printSignOfInteger(num);

    }

    private static void printSignOfInteger(int num) {
        if(num<0){
            System.out.println("The number "+num+" is negative");
        }else {
            System.out.println("The number "+num+" is positive");
        }
    }
}
