import java.util.Scanner;

public class Task23MovieClassification {
    //Determine the movie category a person can watch based on their age:
    // Age &lt; 13: Only U-rated movies.
    // Age 13-17: U and PG-13 rated movies.
    // Age 18+: All movies.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        getMovieCategory(age);
    }

    private static void getMovieCategory(int age) {
       String cathegory="";
       if(age>=0 && age<13){
           cathegory="U-rated movies";
       }else {
           if(age>=13 && age<=17){
               cathegory="U and PG-13 rated movies";
           }else {
               if(age>18 && age<130){
                   cathegory="All movies";
               }else {
                   System.out.println("Wrong input");
               }
           }
       }
        System.out.println(cathegory);
    }
}
