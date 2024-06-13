import java.util.Scanner;

public class Task1Marks {
    public static void main(String[] args) {
        //  //Write a console program that reads a mark (real number) entered by the user and prints
        //        //&quot;Excellent!&quot; if the mark is 5.50 or higher.
        //        //Input Output
        //        //6 Excellent!
        //        //5 no output
        //        //5.51 Excellent!
        Scanner sc=new Scanner(System.in);
        double mark=Double.parseDouble(sc.nextLine());
        if(mark>=5.50){
            System.out.println(mark+" Exellent!");
        }
    }
}
