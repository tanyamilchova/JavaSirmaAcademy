package students;

import java.util.ArrayList;
import java.util.Arrays;

public class Students {
    private String firstName;
    private String lastName;
    private int age;
    private String homeTown;

    public void printInfo(Students student){
        System.out.println(firstName+" "+lastName+" is"+age+" years old");
    }

    public static void main(String[] args) {
        String input = "John Doe 15 Sofia\n" +
                "Peter Peterov 14 Plovdiv\n" +
                "Linda Bridge 16 Sofia\n" +
                "Simeon Bond 12 Varna\n" +
                "end\n" +
                "Sofia";
        String[] rows = input.split("\n");
        String sellectedTown="";
        ArrayList<Students>students=new ArrayList<>();
        for (int i = 0; i < rows.length; i++) {
            if (!rows[i].equalsIgnoreCase("End")){
                String[] persInfo = rows[i].split(" ");
                if(persInfo.length>1) {

                Students student = new Students();
                student.firstName = persInfo[0].trim();
                student.lastName = persInfo[1].trim();
                student.age = Integer.parseInt(persInfo[2].trim());
                student.homeTown = persInfo[3].trim();
                student.printInfo(student);
                students.add(student);
                }else {
                    sellectedTown=rows[i].trim();
                }
            }
        }
        for (int i = 0; i < students.size(); i++) {
            Students student=students.get(i);
            if(student.homeTown.equalsIgnoreCase(sellectedTown)){
                student.printInfo(student);
            }
        }
    }
}
