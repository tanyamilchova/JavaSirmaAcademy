import java.util.Scanner;

public class Task24Encoding {
    //Write a program that receive an integer. On the console should be printed as many lines
    //as there are digits in the number. Each line is formed from the digits of the reversed
    //number. A symbol must be printed on each line with the following conditions:
    // the symbol to be printed is from the ASCII table. Its decimal ASCII code is formed
    //as 33 is added to the digit of the number entered that corresponds to a
    //given line.
    // The symbol is printed as many times as the digit
    // if for a given line corresponds digit 0 on this line print &quot;ZERO&quot;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=Integer.parseInt(sc.nextLine());
        int countDigits=0;
        int temp=num;

        while (temp>0){
            temp/=10;
            countDigits++;
        }
        for (int i = 0; i < countDigits; i++) {
            int digit=num%10;
            if(digit!=0) {
                char ascciCode = (char) (33 + digit);
                for (int j = 0; j < digit; j++) {
                    System.out.print(ascciCode);
                }
            }else {
                System.out.println("ZERO");
            }
            num/=10;
            System.out.println();
        }
    }
}
