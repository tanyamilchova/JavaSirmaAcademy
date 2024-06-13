package aInh.overload;

public class Tests {
    public void test(String s) {
        s = "abcd";
        System.out.println("test(String)");
    }
    public void test(double dd) {
        System.out.println("test(double)");
    }
    public double test(int i, double f) {
        System.out.println("test(int, double)");
        return i * f;
    }

    public static void main(String[] args) {
        Tests tests=new Tests();
        tests.test("Pony");
        tests.test(2);
        tests.test(5,2.0);
    }
}
