package org.example.task2.taskA;

public class ConsoleLogger implements Logger {
    @Override
    public void log(String messege) {
        System.out.println(messege);
    }
}
