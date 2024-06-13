import java.util.Scanner;

public class Task14AmstrongNumCheck {
    //Write a program that receives an integer &#39;n&#39; and checks whether it is an Armstrong
    //number or not. An Armstrong number is a number that is equal to the sum of its own
    //digits raised to the power of the count of digits.
    //Input: An integer &#39;n&#39; to be checked for being an Armstrong number.
    //Output: &quot;Armstrong&quot; if &#39;n&#39; is an Armstrong number, &quot;Not Armstrong&quot; otherwise.

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=Integer.parseInt(sc.nextLine());
        checkIfArmstrong(num);
    }

    private static void checkIfArmstrong(int num) {
        int helpNum=num;
        int helpNum2=num;
        int sum=0;
        int countDigits=0;
        while (helpNum>0){
            helpNum/=10;
            countDigits++;
        }
        while (helpNum2>0){
            int temp=helpNum2%10;
            sum+= (int) Math.pow(temp,countDigits);
            helpNum2/=10;
        }
        if(sum==num){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
