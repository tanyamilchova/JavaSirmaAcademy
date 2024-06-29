package org.example;

import java.util.Scanner;

public class Task5GenericBoxOfIntegers<T> {
    //Test your generic box with Integers.
    private T value;

    public Task5GenericBoxOfIntegers(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.getClass().getName()+":"+value;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=Integer.parseInt(sc.nextLine());
        for (int i = 0; i < num; i++) {
            Integer intInput=Integer.parseInt(sc.nextLine());
            Task5GenericBoxOfIntegers<Integer> box=new Task5GenericBoxOfIntegers<>(intInput);
            System.out.println(box);
        }
    }
}
