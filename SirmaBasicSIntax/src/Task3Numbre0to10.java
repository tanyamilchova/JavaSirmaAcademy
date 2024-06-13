import java.util.Scanner;

public class Task3Numbre0to10 {
    public static void main(String[] args) {

        //Write a function that gets an integer in the range [0... 9] and spells it out in words in
        //English. If the number is out of range, it spells out &quot;too big&quot;.
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        spellANumber(num);
    }

    public static void spellANumber(int num){
        switch (num){
            case 1-> System.out.println("one");
            case 2-> System.out.println("two");
            case 3-> System.out.println("tree");
            case 4-> System.out.println("four");
            case 5-> System.out.println("five");
            case 6-> System.out.println("six");
            case 7-> System.out.println("seven");
            case 8-> System.out.println("eight");
            case 9-> System.out.println("nine");
            default -> System.out.println("too big");
        }
    }
}
