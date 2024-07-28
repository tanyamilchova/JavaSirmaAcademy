import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public abstract class Service {

    private BufferedReader reader;
    private BufferedWriter writer;
    private Map<Long,Employee> employeeMap=new HashMap<>();

    public Service(BufferedReader reader, BufferedWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

//    protected  void readFromCSV(){
//        String path="src/input.txt";
//        try(BufferedReader bufferedReader=new BufferedReader(new FileReader(path))) {
//            String line=bufferedReader.readLine();
//            while (line  != null) {
//                String[] properties = line.split(",");
//                if (properties.length == 5) {
//                    Employee employee = new Employee(Long.parseLong(properties[0].trim()), properties[1].trim(), properties[2].trim(), properties[3].trim(), Double.parseDouble(properties[4].trim()));
//                    addEmployee(employee);
//                } else {
//                    throw new IllegalArgumentException("Enter a valid input!");
//                }
//                line= bufferedReader.readLine();
//            }
//        }
//        catch (IOException e){
//            e.printStackTrace();
//        }
//
//    }
//    protected void writeToCSV() {
//        String path="src/output.txt";
//        try(BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(path))) {
//
//
//            for (Map.Entry<Long, Employee> e : employeeMap.entrySet()) {
//                Employee employee = e.getValue();
//                String emplDetails = String.join(",",
//                        String.valueOf(employee.getId()),
//                        employee.getName(),
//                        employee.getDepartment(),
//                        employee.getPosition(),
//                        String.valueOf(employee.getSalary())
//                );
//                bufferedWriter.write(emplDetails);
//                bufferedWriter.newLine();
//            }
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//    }
protected  void readFromCSV(){
    String path="src/input.txt";
    try {
        String line=reader.readLine();
        while (line  != null) {
            String[] properties = line.split(",");
            if (properties.length == 7) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//                LocalDate startDate = LocalDate.parse(properties[2].trim(), formatter);
//                LocalDate endDate = LocalDate.parse(properties[3].trim(), formatter);
//                LocalDate startDate = LocalDate.parse(properties[2].trim());
//                LocalDate endDate = LocalDate.parse(properties[3].trim());
                LocalDate startDate = Util.getLocalDate(properties[2].trim());
                LocalDate endDate = Util.getLocalDate(properties[3].trim());

                Employee employee = new Employee(Util.getLongInput(properties[0]), properties[1].trim(),startDate, endDate,properties[4].trim(), properties[5].trim(),  Double.parseDouble(properties[6].trim()));
//                Employee employee = new Employee(Long.parseLong(properties[0].trim()), properties[1].trim(), properties[2].trim(), properties[3].trim(), Double.parseDouble(properties[4].trim()));
                addEmployee(employee);
            } else {
                throw new IllegalArgumentException("Enter a valid input!");
            }
            line= reader.readLine();
        }
    }
    catch (IOException e){
        e.printStackTrace();
    }

}
    protected void writeToCSV() {
        String path="src/output.txt";
        try{


            for (Map.Entry<Long, Employee> e : employeeMap.entrySet()) {
                Employee employee = e.getValue();
                String emplDetails = String.join(",",
                        String.valueOf(employee.getId()),
                        employee.getName(),
                        employee.getDepartment(),
                        employee.getPosition(),
                        String.valueOf(employee.getSalary())
                );
                writer.write(emplDetails);
                writer.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    protected void addEmployee(Employee employee){
        long key=employee.getId();
        if( ! employeeMap.containsKey(key)){
            employeeMap.put(key,employee);
        }
    }
    protected void addEmployee(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter employee details (id,name,startDate,endDate,department,position,salary):");
    String line = sc.nextLine();
    String[] properties = line.split(",");
    if(employeeMap.containsKey(Util.getLongInput(properties[0]))){
            System.out.println("Employee with this id already exist");
    }else {
        if (properties.length == 7) {
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//            LocalDate startDate = LocalDate.parse(properties[2].trim(), formatter);
//            LocalDate endDate = LocalDate.parse(properties[3].trim(), formatter);
//            LocalDate startDate = LocalDate.parse(properties[2].trim());
//            LocalDate endDate = LocalDate.parse(properties[3].trim());
            LocalDate startDate = Util.getLocalDate(properties[2].trim());
            LocalDate endDate = Util.getLocalDate(properties[3].trim());
            Employee employee = new Employee(Util.getLongInput(properties[0]), properties[1].trim(),startDate, endDate,properties[4].trim(), properties[5].trim(),  Double.parseDouble(properties[6].trim()));
            long key = employee.getId();
            if (!employeeMap.containsKey(key) && key>0) {
                employeeMap.put(key, employee);
                System.out.println("Added: " + employee);
            }
        } else {
            System.out.println("Enter a valid input!");
        }
    }
    }
//    protected void editEmployee(Long id){
//        Scanner sc=new Scanner(System.in);
//        if( !employeeMap.containsKey(id)){
//            System.out.println("Invalid Id");
//        }else {
//
//            System.out.println("Enter new employee details (name,department,position,salary):");
//            String line = sc.nextLine();
//            String[] properties = line.split(",");
//            if (properties.length == 4) {
//                Employee employee = employeeMap.get(id);
//                String name = properties[0].trim();
//                String department = properties[1].trim();
//                String position = properties[2].trim();
//                double salary = Util.getDoubleInput(properties[3].trim());
//                employee.setName(name);
//                employee.setDepartment(department);
//                employee.setPosition(position);
//                employee.setSalary(salary);
//                employeeMap.put(id, employee);
//                System.out.println("Employee updated: " + employee);
//            }
//        }
//    }
protected void editEmployee(Long id){
    Scanner sc=new Scanner(System.in);
    if( !employeeMap.containsKey(id)){
        System.out.println("Invalid Id");
    }else {

        System.out.println("Enter new employee details (name,department,position,salary):");
        String line = sc.nextLine();
        String[] properties = line.split(",");
        if (properties.length == 6) {
            Employee employee = employeeMap.get(id);
            String name = properties[0].trim();
            String department = properties[1].trim();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate startDate = LocalDate.parse(properties[2].trim(), formatter);
            LocalDate endDate = LocalDate.parse(properties[3].trim(), formatter);


            String position = properties[4].trim();
            double salary = Util.getDoubleInput(properties[5].trim());
            employee.setName(name);
            employee.setDepartment(department);
            employee.setPosition(position);
            employee.setSalary(salary);
            employeeMap.put(id, employee);
            System.out.println("Employee updated: " + employee);
        }
    }
}
    public void fire(Long id) {
        if(employeeMap.remove(id) !=null){
            System.out.println("Fired employee with id:  "+id);
        }else {
            System.out.println("Not found employee id: "+id);
        }
        listEmployees();
    }


//    public Map<Long, Employee> getEmployeeMap() {
//        return employeeMap;
//    }

    public void searchById(Long id){
        if(employeeMap.containsKey(id)){
            Employee employee=employeeMap.get(id);
            System.out.println(employee);
            return;
        }
        System.out.println("Id does not exist!");
    }
    public void searchByName(String name){
        for (Map.Entry<Long,Employee>entry:employeeMap.entrySet()){
            String nameEmployee=entry.getValue().getName();
                if(nameEmployee.equals(name)){
                    System.out.println(entry.getValue());
                    return;
                }
        }
        System.out.println("Name does not exist!");
    }

    public static void displayComands(){
        System.out.println("The allowed commands are:\n" +
                "Add Employee\n" +
                "Edit <Id>\n" +
                "Fire <Id>\n" +
                "List employees\n" +
                "Search Id <Id>\n" +
                "Search Name <Name>\n" +
                "Save & Exit\n"
        );
    }
    public  void printMap(){
        System.out.println(employeeMap);
    }

    public void listEmployees() {
        System.out.println(employeeMap);
    }
}
