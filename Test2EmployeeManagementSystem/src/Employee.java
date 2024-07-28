import java.io.Serializable;
import java.time.LocalDate;

public class Employee implements Serializable {
    private long id;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;

    private String department;
    private  String position;
    private double salary;

//    public Employee(long id, String name, String department, String position, double salary) {
//        this.id = id;
//        this.name = name;
//        this.department = department;
//        this.position = position;
//        this.salary = salary;
//    }


    public Employee(long id, String name, LocalDate startDate, LocalDate endDate, String department, String position, double salary) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.department = department;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String name, String department, String position, double salary) {
        this.name = name;
        this.department = department;
        this.position = position;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

//    @Override
//    public String toString() {
//        return "Employee{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", department='" + department + '\'' +
//                ", position='" + position + '\'' +
//                ", salary=" + salary +
//                '}';
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", department='" + department + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
