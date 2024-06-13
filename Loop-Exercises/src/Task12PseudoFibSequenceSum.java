import java.util.Scanner;

public class Task12PseudoFibSequenceSum {
    //Write a program that receives a positive integer &#39;n&#39; and calculates the sum of the first &#39;n&#39;
    //items in the Fibonacci sequence.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        getSumFirstNFibo(num);
    }
    private static void getSumFirstNFibo(int num) {
        int start=0;
        int second=1;
        int sum=start+second;
        for (int i = 0; i < num-1; i++) {
            int current=start+second;
            sum=sum+current;
            start=second;
            second=current;
        }
        System.out.println(sum);
    }
}
