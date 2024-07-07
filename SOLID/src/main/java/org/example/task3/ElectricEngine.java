package org.example.task3;

public class ElectricEngine implements Engine{
    public ElectricEngine() {
        System.out.println("I am an electric engin.");
    }

    @Override
    public void start() {
        System.out.println("Electric engine start");
    }
}
