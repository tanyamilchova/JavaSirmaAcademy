import java.util.Scanner;

public class Task26EvenPairs {
    //Write a program that generates and prints on the console four-digit numbers in which the
    //first and second pairs of digits form two-digit primes (an example of such a number
    //
    //e: office@sirma.bg a: 135 Tsarigradsko Shosse, blvd.
    //m: +359 2 9768310 1784 Sofia, Bulgaria
    //
    //sirma.com
    //1723). The final value to which the pairs should be generated is determined by another 2
    //digits received as input, which determine how much the final value is greater than the
    //initial
    //The input contains exactly 4 parameters:
    // In the first row – the initial value of the first first pair of numbers – a positive
    //integer in the range [10... 90]
    // In the second row – the initial value of the second pair of numbers – a
    //positive integer in the range [10... 90]
    // In the third row – the difference between the initial and final values of the first
    //pair of numbers – a positive integer in the range [1... 9]
    // In the fourth row – the difference between the initial and final values of the
    //second pair of numbers – a positive integer in the range [1... 9]
    //Print four-digit numbers in which the first two and second two digits are prime two-digit
    //numbers.
    //Input Output
    //10     1123
    //20     1323
    //5
    //5
    //Explanations:
    //The initial value of the first pair of digits is 10,
    //and of the second 20. The final values are
    //respectively:
    //10 + 5 = 15
    //20 + 5 = 25
    //There are the following combinations:
    //1020 1021 1022 1023 1024 1025 1120
    //1121 1122 1123 1124 1125 ... 1320 1321
    //1322 1323 1324 1325 1420 1421
    //1422 1423 1424 1425 1520 1521 1522 15
    //23 1524 1525
    //But of these, only 1123 and 1323 are four-
    //digit numbers in which the first part and
    //the second are both primes.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int pair1 = Integer.parseInt(sc.nextLine());
        int pair2 = Integer.parseInt(sc.nextLine());
        int addent1 = Integer.parseInt(sc.nextLine());
        int addent2 = Integer.parseInt(sc.nextLine());
        generateFourDigitNUmFromPrimePairs(pair1, pair2, addent1, addent2);
    }

    private static void generateFourDigitNUmFromPrimePairs(int pair1, int pair2, int addend1, int addend2) {
        int end1 = pair1 + addend1;
        int end2 = pair2 + addend2;

        for (int i = pair1; i <= end1; i++) {
            for (int j = pair2; j <= end2; j++) {
                if (isPrime(i) && isPrime(j)) {
                    System.out.println("" + i + j);
                }
            }
        }
    }

    public static boolean isPrime(int num) {
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        }
        for (int j = 2; j <= Math.sqrt(num); j++) {
            if (num % j == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}