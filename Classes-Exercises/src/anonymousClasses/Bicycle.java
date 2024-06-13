package anonymousClasses;

import java.util.ArrayList;
import java.util.Arrays;

public class Bicycle implements CustomTest{
    @Override
    public void test() {
        System.out.println("Test in Bicycle");
    }

    public static void main(String[] args) {
        ArrayList<CustomTest>list=new ArrayList<>();
        Car car=new Car();
        Bicycle bicycle=new Bicycle();
        list.add(car);
        list.add(bicycle);
        System.out.println(list);
    }
    @Override
    public String toString() {
        return Car.class.getName();
    }
}
