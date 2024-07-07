package org.example.task5.taskA;

public class Lamb implements SwitchableDevice{
    @Override
    public void turnOn() {
        System.out.println("Lamb switch on");
    }

    @Override
    public void turnOff() {
        System.out.println("Lamb switch off");
    }
}
