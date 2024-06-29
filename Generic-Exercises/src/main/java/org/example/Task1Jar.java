package org.example;

import java.util.ArrayDeque;

public class Task1Jar <T>{
//Create a class Jar&lt;&gt; that can store anything.
//It should have two public methods:
// void add(element)
// element remove()
//Adding should add on top of its contents. Remove should get the topmost element.
//Use the syntax Jar&lt;T&gt; to create a generic class.

    private ArrayDeque<T>list=new ArrayDeque<>();

    public void add(T element){
        list.push(element);
    }
    public void remove(){
        list.pop();
    }

    public static void main(String[] args) {

        Task1Jar<String> stringJar=new Task1Jar<>();
        stringJar.add("String element");
        stringJar.add("NewString element");
        System.out.println(stringJar.list);
        stringJar.remove();
        System.out.println(stringJar.list);


        Task1Jar<Integer> intJar=new Task1Jar<>();
        intJar.add(0);
        intJar.add(5);
        System.out.println(intJar.list);
        intJar.remove();
        System.out.println(intJar.list);
    }
}
