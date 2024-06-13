import java.util.Scanner;

public class Task45EqualSumOddAndEven {
    //Write a function that accepts two six-digit integers ranging from 100000 to 300000.
    //Always the first number entered will be less than the second. On the console print all
    //numbers that are located between the two meeting the following condition:
    // the sum of the digits of even and odd positions shall be equal.
    //If there are no numbers matching the condition, “None” is displayed.
    //Sample input:
    //input output
    //100000
    //100050
    //
    //100001
    //100012
    //100023
    //100034
    //100045
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = Integer.parseInt(sc.nextLine());
        int num2 = Integer.parseInt(sc.nextLine());
        int temp=0;
        if(num1>num2){
            temp=num1;
            num1=num2;
            num2=temp;
        }
        validateInp(num1,sc);
        validateInp(num2,sc);
        drawEqualOddAndEvenPositions(num1, num2);

    }


    private static void drawEqualOddAndEvenPositions(int num1, int num2) {

        for (int i = num1+1; i <num2 ; i++) {
            int temp=i;
            int sumEven=0;
            int sumOdd=0;
            int countPosition=0;
            while (temp>0){
               int lastDigit=temp%10;
                if(countPosition%2==0){
                    sumEven+=lastDigit;
                }else {
                    sumOdd+=lastDigit;
                }
                temp/=10;
                countPosition++;
            }
            if(sumEven==sumOdd){
                System.out.println(i);
            }else {
                System.out.println("None");
            }
        }
    }
    public static void validateInp(int num,  Scanner sc) {
        while (num < 100000 || num > 300000) {
            System.out.println("The value  " + num + " have to be in range-0 - 1000" );
            num = Integer.parseInt(sc.nextLine());
        }
    }
}
