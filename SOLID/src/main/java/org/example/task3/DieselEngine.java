package org.example.task3;

public class DieselEngine implements Engine{
    public DieselEngine() {
        System.out.println("I am a diesel engin.");
    }

    @Override
    public void start() {
        System.out.println("DiselEngine start");
    }
}
