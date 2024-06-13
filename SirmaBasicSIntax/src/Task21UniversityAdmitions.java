import java.util.Scanner;

public class Task21UniversityAdmitions {
    //21. University Admissions
    //
    //Write a console program to determine if a student is admitted to the university based on their
    //score and extracurricular activities:
    // Score &gt;= 90: Admitted regardless of extracurriculars.
    // Score 80-89: Admitted if they have &gt;= 2 extracurriculars.
    // Score &lt; 80: Not admitted.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int score=sc.nextInt();
        int extracurriculsrs=sc.nextInt();
        checkIfAdmitted(score,extracurriculsrs);
    }

    private static void checkIfAdmitted(int score, int extracurriculsrs) {
        boolean addmitted=false;
        if(score>=90){
            addmitted=true;
        }else {
            if(score>=80 && score<=89){
                if(extracurriculsrs>=2){
                    addmitted=true;
                }
            }
        }
        if(addmitted){
            System.out.println("Admmited");
        }else {
            System.out.println("Not admmited");
        }
    }
}
