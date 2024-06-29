package org.example;

import java.util.*;

public class Task10CustomList<T> {
     static class CustomList<T extends Comparable<T>>{
          private ArrayList<T>list=new ArrayList<>();
          public void addElement(T elemendt){
          list.add(elemendt);
          }
          public void remove(T element){
              list.remove(element);
          }
          public boolean contains(T element) {
              return list.stream().anyMatch(e -> e.equals(element));
          }
          public void swap(int pos1, int pos2){
              if(list.size()<=pos2){
                  System.out.println("List: "+list);
                  System.out.println("Pos2:"+pos2+"List size:"+list.size());
                  return;
              }
              System.out.println("List: "+list);
              list.add(pos1,list.get(pos2));
              list.remove(pos2+1);
              list.add(pos2+1,list.get(pos1+1));
              list.remove(pos1+1);
          }
          public int greaterCount(T value){
              int countGreater=0;
              for (T element:list){
                  if(element.compareTo(value)>0){
                      countGreater++;
                  }
              }
              return countGreater;
          }
          public void max(){
              Optional<T>opt =list.stream().max((o1, o2) -> o1.compareTo(o2));
              if(opt.isPresent()){
                  System.out.println(opt);
              }
          }
          public void min(){
              Optional<T>minOpt=list.stream().min(Comparable::compareTo);
              if(minOpt.isPresent()){
                  System.out.println(minOpt);
              }
          }
          public void print(){
              for (T element:list){
                  System.out.print(element+" ");
              }
          }
    }

    public static void main(String[] args) {
        CustomList<String>customListt=new CustomList<>();
        Scanner sc=new Scanner(System.in);

        while (true){
        String input=sc.nextLine();
        String[] arrInput=input.split(" ");
        String comand=arrInput[0].trim();

            switch (comand){
                case "Add"->{
                    String element=arrInput[1].trim();
                    customListt.addElement(element);
                }
                case "Max"->customListt.max();
                case "Min"->customListt.min();
                case "Swap"->{
                     String positions=arrInput[1].trim();
                     int pos1=Integer.parseInt(arrInput[1].trim());
                     int pos2=Integer.parseInt(arrInput[2].trim());
                     customListt.swap(pos1,pos2);
                     System.out.println(customListt.list);
                }
                case "Contains"->{
                    String element=arrInput[1].trim();
                    customListt.contains(element);
                }
                case "Print"->customListt.print();
                case "Greater"->{
                    String element=arrInput[1].trim();
                    System.out.println(customListt.greaterCount(element));
                }
                case "end"-> {
                    return;
                }
            }
        }
    }
}
