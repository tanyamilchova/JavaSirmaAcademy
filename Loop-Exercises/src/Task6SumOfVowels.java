import java.util.Scanner;

public class Task6SumOfVowels {
    //Write a function that accepts text (string) and calculates and prints the sum of the values
    //of the vowel letters according to the table below:
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        int sumVowels=0;
        for (int i = 0; i < word.length(); i++) {
            switch (word.charAt(i)){
                case 'a'->sumVowels+=1;
                case 'e'->sumVowels+=2;
                case 'i'->sumVowels+=3;
                case 'o'->sumVowels+=4;
                case 'u'->sumVowels+=5;
            }
        }
        System.out.println(sumVowels);
    }
}
