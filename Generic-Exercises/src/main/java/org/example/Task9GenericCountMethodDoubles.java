package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Task9GenericCountMethodDoubles {
    //Test your list of generic boxes with Doubles.
    static class Box<T extends Comparable<T>>{
        private ArrayList<T> list=new ArrayList<>();
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
      Box<Double> doubleBox=new Box();
        Scanner sc=new Scanner(System.in);
        int numQueries=Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numQueries; i++) {
            Double elem=Double.parseDouble(sc.nextLine());
            doubleBox.list.add(elem);
        }
        Double toCompareStr=Double.parseDouble(sc.nextLine());
        System.out.println(doubleBox.countGreater(doubleBox.list,toCompareStr));
    }
}

