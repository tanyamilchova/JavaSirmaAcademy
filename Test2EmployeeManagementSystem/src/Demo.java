import java.io.*;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Management System");
        Service.displayComands();
        String path="src/input.txt";
        String outputPath="src/output.txt";
            try (BufferedReader reader = new BufferedReader(new FileReader(path));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {

                Service employeeService = new EmployeeService(reader, writer);
                employeeService.readFromCSV();
                Manager employeeManager=new EmployeeManager(employeeService);

                Scanner sc=new Scanner(System.in);
                boolean isRunning=true;
                while (isRunning){
                    String command=sc.nextLine();
                    employeeManager.execute(command);
                    if(command.equals("Save & Exit")){
                        employeeService.writeToCSV();
                        isRunning=false;
                    }
                }
                employeeService.readFromCSV();
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}
