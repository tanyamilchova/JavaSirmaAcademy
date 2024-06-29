package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Task6GenericSwapMethodStrings<T> {
    //Create a generic method that receives a list containing any type of data and swaps the
    //elements at two given indexes.
    //Read n number of boxes of type String and add them to the list. On the next line,
    //however, you will receive a swap command consisting of two indexes. Use the method
    //you&#39;ve created to swap the elements corresponding to the given indexes and print each
    //element in the list.
    ArrayList<T>list=new ArrayList<>();
    T value;
    public <T>void swap(int pos1, int pos2){
        list.add(pos1,list.get(pos2));
        list.remove(pos2+1);
        list.add(pos2+1,list.get(pos1+1));
        list.remove(pos1+1);
    }
    @Override
    public String toString() {
        return value.getClass().getName()+":"+value;
    }

    public static void main(String[] args) {
        Task6GenericSwapMethodStrings<String>box=new Task6GenericSwapMethodStrings<>();

        Scanner sc=new Scanner(System.in);
        int num=Integer.parseInt(sc.nextLine());
        for (int i = 0; i < num; i++) {
            String elem=sc.nextLine();
        box.list.add(elem);
        }
        String spapInput=sc.nextLine();
        String[]str=spapInput.split(" ");
        int p1=Integer.parseInt(str[0].trim());
        int p2=Integer.parseInt(str[1].trim());

        box.swap(p1,p2);
        System.out.println(box.list);
    }
}

