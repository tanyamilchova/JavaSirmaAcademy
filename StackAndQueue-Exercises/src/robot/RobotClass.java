package robot;

import java.time.LocalTime;

public class RobotClass {
    String name;
    int processTime;
    boolean isAvailabl=true;
    LocalTime startTime;

    RobotClass(String name, int processTime) {
        this.name = name;
        this.processTime = processTime;
        this.startTime=LocalTime.of(0,0,0);
    }

    public void setAvailable(boolean available) {
        this.isAvailabl = available;
    }
}
