package org.example.task4.taskB;

public class OldPlayer implements Player{
    @Override
    public void play() {
        System.out.println("Old player play");
    }

    @Override
    public void pause() {
        System.out.println("Old player pause");
    }
}
