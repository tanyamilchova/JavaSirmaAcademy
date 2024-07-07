package org.example.task5.taskB;

public class DemoTemperatureDevice {
    public static void main(String[] args) {
        Temperaturable tempSensor=new TemperatureSensor();
        WeatherReporter reporter=new WeatherReporter();
        reporter.report(tempSensor);
    }
}
