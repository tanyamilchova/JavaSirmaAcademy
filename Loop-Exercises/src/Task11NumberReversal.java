import java.util.Scanner;

public class Task11NumberReversal {
    //Write a program that receives an integer &#39;n&#39; and prints its reverse.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=Integer.parseInt(sc.nextLine());
        revertNumber(num);
    }
    private static void revertNumber(int num) {
      int resultNum=0;
        while (num>0){
          int tempNum=0;
          tempNum=num%10;
          resultNum*=10;
          resultNum+=tempNum;
          num/=10;
      }
        System.out.println(resultNum);
    }
}
