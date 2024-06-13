import java.util.Scanner;

public class Task13PalindromCheck {
    //Write a program that receives a string from the console and checks whether it is a
    //palindrome (reads the same forwards and backwards) or not.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        checkIfPalindrome(word);
    }

    private static void checkIfPalindrome(String word) {
        StringBuilder builder=new StringBuilder();
        for (int i = word.length()-1; i >= 0; i--) {
            char letter= word.charAt(i);
            builder.append(letter);
        }
        String revertedWord= builder.toString();
        if(revertedWord.equals(word)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}


