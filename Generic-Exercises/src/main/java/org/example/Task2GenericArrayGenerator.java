package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task2GenericArrayGenerator<T> {
    //Create a class ArrayCreator with a method and a single overload to it:
    // static T[] create(int length, T item)
    // static T[] create(Class&lt;T&gt; class, int length, T item)
    //The method should return an array with the given length, and every element should be
    //set to the given default item.
    static <T>T[]create(int length,T item){
        @SuppressWarnings("unchecked")
        T[] arr=( T[]) Array.newInstance(item.getClass(),length);
        for (int i = 0; i < length; i++) {
            arr[i]=item;
        }
        return arr;
    }
    static <T>T[]create(Class<T>clazz,int length, T item){
        @SuppressWarnings("unchecked")
        T[]arr=(T[])Array.newInstance(clazz,length);
        for (int i = 0; i < length; i++) {
            arr[i]=item;
        }
        return arr;
    }

    public static void main(String[] args) {
        Integer[]intArr=Task2GenericArrayGenerator.create(5,42);
        System.out.println(Arrays.toString(intArr));
        System.out.println();
        String[]strArr=Task2GenericArrayGenerator.create(String.class,5,"Java");
        System.out.println(Arrays.toString(strArr));
    }
}
