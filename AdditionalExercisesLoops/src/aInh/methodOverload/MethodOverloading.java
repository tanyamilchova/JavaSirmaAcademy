package aInh.methodOverload;

import java.util.logging.Logger;

public class MethodOverloading {
    String name="Method";

    MethodOverloading(byte  b)  {
        System.out.println("Good day employee!");
    }
    MethodOverloading(long  i)  {
        System.out.println("Good night employee!");
    }
    static void doJob(Integer num) {
        System.out.println("Integer");
    }
    static void doJob(Object obj) {
        System.out.println("Object");
    }
    static void doJob(int number) {
        System.out.println("int");
    }

    @Override
    public String toString() {
        return this.name;
    }

    public static void main(String[] args) {
        MethodOverloading method=new MethodOverloading(5);
        Object o=10;
        doJob(o);
        Logger.global.info("The current position is " + method);
    }
}
