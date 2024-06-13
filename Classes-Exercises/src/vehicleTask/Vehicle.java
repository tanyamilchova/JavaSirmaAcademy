package vehicleTask;

public class Vehicle {
    private String type;
    private String model;
    private Engine engine;
    private int fuel;

    public Vehicle(String type, String model, Engine engine, int fuel) {
        this.type = type;
        this.model = model;
        this.engine = engine;
        this.fuel = fuel;
    }

    public void drive(int fuelLoss){
        this.fuel-=fuelLoss;
    }

    public static void main(String[] args) {
        Engine engine1=new Engine(100);
        Vehicle vehicle=new Vehicle("a","b",engine1,200);
        vehicle.drive(100);
        System.out.println(vehicle.fuel);
    }
}
