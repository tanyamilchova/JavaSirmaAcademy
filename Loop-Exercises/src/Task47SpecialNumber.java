import java.util.Scanner;

public class Task47SpecialNumber {
    //Write a function that takes an integer n and generates all possible &quot;special&quot; numbers from
    //1111 to 9999. For a number to be &quot;special,&quot; it must meet the following condition:
    //• n to be divided by each of its digits without a remainder.
    //For example, n = 16, 2418 is a special number:
    //• 16 / 2 = 8 without remainder
    //• 16 / 4 = 4 without remainder
    //• 16 / 1 = 16 without remainder
    //• 16 / 8 = 2 without remainder
    //Sample input:
    //input output
    //3 1111
    //1113
    //1131
    //1133
    //1311
    //1313
    //1331
    //1333
    //3111
    //3113
    //3131
    //3133
    //3311
    //3313
    //3331
    //3333
    //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        getSpecialNumber(n);
    }

    private static void getSpecialNumber(int n) {
        for (int i = 1111; i <= 9999; i++) {
            int temp=i;
            boolean divisible=true;
            while (temp>0){
                int digit=temp%10;
                if(digit==0 ||n%digit!=0){
                    divisible=false;
                    break;
                }
                temp/=10;
            }
            if(divisible) {
                System.out.println(i);
            }
        }
    }
}
