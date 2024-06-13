import java.lang.reflect.Array;
import java.util.ArrayList;

public class Car {
    private String brand;
    private String model;
    private String horsePower;

    public Car(String brand, String model, String horsePower) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }

    public void carInfo(){
        System.out.println("The car is: "+brand+" "+model+"-"+horsePower+ " HP");
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getHorsePower() {
        return horsePower;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHorsePower(String horsePower) {
        this.horsePower = horsePower;
    }

    public static void main(String[] args) {
        Car car=new Car("Toiota","Rav4","390");
        Car car1=new Car("Mercedes ","Benz","500");
        Car car2=new Car("Volga","34","49");
        ArrayList<Car>carArray=new ArrayList<>();
        carArray.add(car1);
        carArray.add(car2);
        carArray.add(car);
        for (Car c:carArray){
            c.carInfo();
        }
    }
}
