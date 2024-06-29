package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Task8GenericCountMethod {
    //Create a method that receives as an argument a list of any type that can be
    //compared and an element of the given type. The method should return the count of
    //elements that are greater than the value of the given element. Modify your Box
    //class to support comparing by the value of the data stored.
    //On the first line, you will receive n - the number of elements to add to the list. On the
    //next n lines, you will receive the elements. On the last line, you will get the value of the
    //element to which you need to compare every element in the list.


    static class Box<T extends Comparable<T>>{
        private ArrayList<T>list=new ArrayList<>();
    public int countGreater(ArrayList<T>list,T value){
        int countGreater=0;
        for (T element:list){
            if(element.compareTo(value)>0){
                countGreater++;
            }
        }
        return countGreater;
    }
}

    public static void main(String[] args) {

        Box<Integer> intBox=new Box();
        Scanner sc=new Scanner(System.in);
        int numQueries=Integer.parseInt(sc.nextLine());

        for (int i = 0; i < numQueries; i++) {
            Integer elem=Integer.parseInt(sc.nextLine());
            intBox.list.add(elem);
        }
        Integer toCompareStr=Integer.parseInt(sc.nextLine());
        System.out.println(intBox.countGreater(intBox.list,toCompareStr));

    }
}
