package aInh;

public class B1 extends A1{

    public void job(int i) {
        System.out.println("Class B");
    }
    public void job(String name) {
        System.out.println("Namu in Class B");
    }
    public static void f1(){
        System.out.println("Schedule");
    }

    public static void main(String [] args) {
        B1 b = new B1();
        b.job();
        b.job(5);
        b.job("Name");

    }



}
