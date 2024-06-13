import java.util.Scanner;

public class Task2Grades {
    //Write a method that receives a grade between 2.00 and 6.00 and prints the
    //corresponding grade in words:
    // 2.00 – 2.99 - &quot;Fail&quot;
    // 3.00 – 3.49 - &quot;Poor&quot;
    // 3.50 – 4.49 - &quot;Good&quot;
    // 4.50 – 5.49 - &quot;Very good&quot;
    // 5.50 – 6.00 - &quot;Excellent&quot;
    //Inpu
    //t
    //Output
    //3.33 Poor
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double num=Double.parseDouble(sc.nextLine());
        printCorespondingGrade(num);

    }

    private static void printCorespondingGrade(double num) {
       if(num>=0 && num<=2.99){
           System.out.println("Fail");
       }else {
           if(num>2.99 && num<=3.49){
               System.out.println("Poor");
           }else {
               if(num>3.49 && num<=4.49){
                   System.out.println("Good");
               }else {
                   if(num>4.49 && num<=5.49){
                       System.out.println("Very good");
                   }else {
                       if(num>5.49 && num<=6.00){
                           System.out.println("Excellent");
                       }
                   }
               }
           }
       }
    }
}
