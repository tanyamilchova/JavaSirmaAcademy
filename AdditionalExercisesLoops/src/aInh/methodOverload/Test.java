package aInh.methodOverload;

public class Test {
    public class Main {
        static void doJob(String... ss) {
            System.out.println("String...");
        }
        static void doJob(String s1, String s2) {
            System.out.println("String, String");
        }
        static void doJob(String s1, String... str) {
            System.out.println("String, String...");
        }

        public static void main(String[] args) {
            String []arr={"1"};
            doJob("hi",arr);
            doJob("hi", "hi, hi");
        }
    }
}
