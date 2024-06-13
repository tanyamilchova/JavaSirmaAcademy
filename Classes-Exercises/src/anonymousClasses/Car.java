package anonymousClasses;

public class Car implements CustomTest{
     private int age;
    @Override
    public void test() {
        System.out.println("Test in Car");
    }

    public static void main(String[] args) {
        Car car=new Car();
        car.test();
    }

    @Override
    public String toString() {
        return Car.class.getName();
    }
}
