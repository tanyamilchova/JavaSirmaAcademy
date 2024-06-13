import java.util.Scanner;

public class Task29UniqueCodes {
    //Write a function that generates three-digit codes, with the digits of each code in a certain
    //interval. For a code to be valid, it must meet the following conditions:
    // The first and third digits must be even.
    // The second digit must be a prime number in the range [2...7].
    //Input
    //You take 3 parameters:
    // The upper limit of the first number - an integer in the range [1...9]
    // The upper limit of the second number - an integer in the range [1...9]
    // The upper limit of the third number - an integer in the range [1...9]
    //Output
    //Print on the console all valid three-digit codes whose digits correspond to the appropriate
    //intervals.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstLimit = Integer.parseInt(sc.nextLine());
        int secondLimit = Integer.parseInt(sc.nextLine());
        int thirdLimit = Integer.parseInt(sc.nextLine());

        validateInpDigits(firstLimit, sc);
        validateInpDigits(secondLimit, sc);
        validateInpDigits(thirdLimit, sc);
        generateCode(firstLimit, secondLimit, thirdLimit);
    }

    private static void generateCode(int firstLimit, int secondLimit, int thirdLimit) {

        int numDigits = 3;
        for (int i = 1; i < firstLimit; i++) {
            int code = 0;
            if (i % 2 == 0) {
                System.out.print(i);
                code = i;
            }
            for (int j = 1; j < secondLimit; j++) {
                if (i < 2 || i > 7) {
                    continue;
                } else {
                    code = code * 10 + j;
                    System.out.print(j);
                }
                for (int k = 1; k < thirdLimit; k++) {
                    if (k % 2 == 0) {
                        code = code * 10 + k;
                        System.out.print(k);
                    }
                }
                System.out.println();
            }
            System.out.println(code);
        }
    }
        public static void validateInpDigits ( int item, Scanner sc){
            while (item < 1 || item > 9) {
                System.out.println("The value  " + item + " have to be in range-0 - 1000");
                item = Integer.parseInt(sc.nextLine());
            }
    }
}
