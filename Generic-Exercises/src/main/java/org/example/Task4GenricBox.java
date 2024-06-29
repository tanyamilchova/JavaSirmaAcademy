package org.example;

import java.util.Scanner;

public class Task4GenricBox<T>{
    //Create a generic class Box that can store any type. Override the toString() method to
    //print the type and the value of the stored data in the format &quot;{class full name}:
    //{value}&quot;.
    //Use the class that you&#39;ve created and test it with the class java.lang.String. On the first
    //line, you will get n - the number of strings to read from the console. On the next n lines,
    //you will get the actual strings. For each of them, create a box and call its toString()
    //method to print its data on the console.
    private  T value;

    public Task4GenricBox(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.getClass().getName()+":"+value;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int numQueries=Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numQueries; i++) {
            String str=sc.nextLine();
            Task4GenricBox<String> box=new Task4GenricBox<>(str);
            System.out.println(box);
        }
    }
}
