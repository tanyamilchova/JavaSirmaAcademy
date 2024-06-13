package aInh;

public class Car extends Vehicle {
        protected int maxSpeed = 300;
        public void showSpeed() {
            System.out.println(super.maxSpeed);
            System.out.println(maxSpeed);
        }
    public static void main(String[] args) {
        Car car = new Car();
        car.showSpeed();
    }
    }
