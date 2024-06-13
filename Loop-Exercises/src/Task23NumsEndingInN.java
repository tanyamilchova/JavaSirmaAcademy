import java.util.Scanner;

public class Task23NumsEndingInN {
    //Write a program that prints the numbers in the range [1... 1000],
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start=Integer.parseInt(sc.nextLine());

        for (int i = start; i <=1000 ; i++) {
            if(i%10==start){
                System.out.println(i);
            }
        }
    }
}
