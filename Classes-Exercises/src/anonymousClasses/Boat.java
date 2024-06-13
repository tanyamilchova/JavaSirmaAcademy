package anonymousClasses;

public class Boat {
    public void doBoatJob(CustomTest customTest){
        System.out.println("Boat");
    }

    public static void main(String[] args) {
        Boat boat=new Boat();
        boat.doBoatJob(()-> System.out.println("Boat"));

    }
}
