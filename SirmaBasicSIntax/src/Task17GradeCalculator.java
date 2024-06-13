import java.util.Scanner;

public class Task17GradeCalculator {
    //Write a console program that takes a percentage score (0 to 100) as input and outputs the
    //corresponding grade:
    // A: 90-100%
    // B: 80-89%
    // C: 70-79%
    // D: 60-69%
    // F: 0-59%
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int scores=sc.nextInt();
        getGrade(scores);
    }

    private static void getGrade(int scores) {
        String grade="";
        if(scores>=90 && scores<=100){
            grade="A";
        }else {
            if(scores>=80 && scores<=89){
                grade="B";
            }else {
                if(scores>=70 && scores<=79){
                    grade="C";
                }else {
                    if(scores>=60 && scores<=69){
                        grade="D";
                    }else {
                        if(scores>=0 && scores<=59){
                            grade="F";
                        }else {
                            System.out.println("Wrong input");
                        }
                    }
                }
            }
        }
        System.out.println(grade);
    }
}

