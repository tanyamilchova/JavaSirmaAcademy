import java.util.ArrayList;

public class CarConstructors {
    private String brand;
    private String model;
    private int horsePower;
    CarConstructors(String brand){
    this.brand=brand;
    this.model="unknown";
    this.horsePower=-1;
    }
    public CarConstructors(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.horsePower = -1;
    }

    public CarConstructors(String brand, String model, int horsePower) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }

    public  void carInfo(){
        System.out.println("The car is: "+brand+" "+model+"-"+horsePower+ " HP");
    }

    public static void main(String[] args) {
        CarConstructors car=new CarConstructors("Mercedes");
        CarConstructors car1=new CarConstructors("Golf","Polo",49);
        CarConstructors car2=new CarConstructors("Chevrolet");
        CarConstructors car3=new CarConstructors("Toyota","Rav4");
        System.out.println(car.model);
        System.out.println(car.horsePower);
        ArrayList<CarConstructors>cars=new ArrayList<>();
        cars.add(car);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        for (CarConstructors c:cars){
            c.carInfo();
        }
    }
}
