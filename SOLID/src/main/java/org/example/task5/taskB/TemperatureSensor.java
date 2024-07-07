package org.example.task5.taskB;

public class TemperatureSensor implements Temperaturable{
    private double temperature=25;
    @Override
    public double getTemperature() {
        System.out.println("Temperature from TemperatureSensor:");
        return this.temperature;
    }
}
