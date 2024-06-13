import java.util.Scanner;

public class Task10MultiplyEvensByOdds {
    //Create a program that reads an integer number and multiplies the sum of all its even
    //digits by the sum of all its odd digits:
    //Input Output
    //12345 54
    //12345 54
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=Integer.parseInt(sc.nextLine());
        multiplyEvenSumByOdsSum(number);
    }

    private static void multiplyEvenSumByOdsSum(int number) {
        int tepNum=number;
        int evenSum=0;
        int oddSum=0;

        while (tepNum>0){
            int remnance=tepNum%10;
            if(remnance%2==0){
                evenSum+=remnance;
            }else {
                oddSum+=remnance;
            }
            tepNum/=10;
        }
        System.out.println(evenSum*oddSum);
    }


}
