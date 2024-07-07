package org.example.task4.taskB;

public class ModernPlayer implements Player,Nexatble,Previousable,Shuffleable{
    @Override
    public void next() {
        System.out.println("Modern player go next");
    }

    @Override
    public void play() {
        System.out.println("Modern player play");
    }

    @Override
    public void pause() {
        System.out.println("Modern player pause");
    }

    @Override
    public void previous() {
        System.out.println("Modern player go to previous");
    }

    @Override
    public void shuffle() {
        System.out.println("Modern player shuffle");
    }
}
