import java.util.Scanner;

public class Task9SumOfEvenNums {
    //Write a program that receives an integer &#39;n&#39; and calculates the sum of the first &#39;n&#39; even
    //numbers. Display the result on the console.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        calculateSumEvenNums(num);
    }

    private static void calculateSumEvenNums(int num) {
        int sumEven=0;
        int start=1;
        while (num>0){
            if(start%2==0){
                sumEven+=start;
                num--;
            }
            start++;
        }
        System.out.println(sumEven);
    }
}
