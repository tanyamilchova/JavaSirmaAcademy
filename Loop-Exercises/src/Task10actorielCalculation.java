import java.util.Scanner;

public class Task10actorielCalculation {
    //Write a program that receives a positive integer &#39;n&#39; and calculates its factorial.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=Integer.parseInt(sc.nextLine());
        getFactoriel(num);
    }

    private static void getFactoriel(int num) {
        long factoriel=1;
        for (int i = 1; i <= num; i++) {
            factoriel*=i;
        }
        System.out.println(factoriel);
    }
}
