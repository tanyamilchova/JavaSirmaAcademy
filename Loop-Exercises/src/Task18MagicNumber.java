import java.util.Scanner;

public class Task18MagicNumber {
    //Write a function that checks all possible combinations of a pair of numbers in the range of
    //two given numbers. Print in which line is the combination whose sum of the numbers is
    //equal to a given magic number. If there is no combination matching the condition print a
    //message that magic number was not found.
    //Three parameters:
    // First – beginning of the interval – integer in the range [1...999]
    // Second – end of the interval – integer in the interval [greater than the first
    //number... 1000]
    // Third – the magic number – an integer in the range [1...10000]
    //Output
    //One line should be printed on the console, according to the result:
    // If a combination whose sum of numbers is equal to the magic number is found
    //o &quot;Combination {sequence number} - ({first number} + {second number} =
    //{magic number})&quot;
    //
    // If no combination was found matching the condition
    //o &quot;{the number of combinations} combinations - neither equals {magic
    //number}&quot;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start=Integer.parseInt(sc.nextLine());
        int end=Integer.parseInt(sc.nextLine());
        int magicNum=Integer.parseInt(sc.nextLine());
        checkCombinations(start,end,magicNum);

    }

    private static void checkCombinations(int start, int end, int magicNum) {
        int combCounter=0;
        boolean combFound=false;
        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                combCounter++;
                if(i+j==magicNum){
                    System.out.println("Combination "+combCounter+"- ("+i+"+"+j+")="+magicNum);
                    combFound=true;
                    break;
                }
            }
            if(combFound){
                break;
            }
        }
        if(!combFound){
            System.out.println(combCounter+" conbinations - neither equals "+magicNum);
        }
    }
}
