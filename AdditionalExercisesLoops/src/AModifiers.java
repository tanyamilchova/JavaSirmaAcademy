public class AModifiers {
    private static int fakNum;
    public static int year;
    private String name;


    public  static int getStudents() {
        year=5;

        return fakNum;
    }
    public   int getStudentsNum() {
        year=10;
        return fakNum;
    }

    public  void setStudents(int students) {
        AModifiers.fakNum = students;
        fakNum++;
        getStudents();
        name="Name";
        year=12;
        printFakNum();
    }
    public  static void printFakNum(){
        year=15;
        System.out.println(fakNum+"FakNum");

    }

    public static void main(String[] args) {
        AModifiers a=new AModifiers();
        AModifiers.printFakNum();
        a.setStudents(20);
        AModifiers.printFakNum();
    }
}
