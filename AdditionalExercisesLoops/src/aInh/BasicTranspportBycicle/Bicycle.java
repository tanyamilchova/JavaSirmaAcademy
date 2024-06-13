package aInh.BasicTranspportBycicle;

import aInh.basicTransport.Vehicle;

public class Bicycle extends Vehicle{
    private int id;
        public void showSpeed() {
            System.out.println(maxSpeed);

        }
    public void showSuperSpeed() {
        super.showSpeed();
        System.out.println(protection);
        }
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Bicycle bicycle = new Bicycle();
        System.out.println(vehicle.maxSpeed);
        System.out.println(bicycle.maxSpeed);
        vehicle.showSpeed();
        bicycle.showSpeed();
        System.out.println(bicycle.id);
    }
    }

