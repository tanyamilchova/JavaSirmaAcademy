package org.example.tasksHomework;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Task12PersonSer {
   static class Person implements Serializable{
        int id;
        String name;
        int age;



        public Person(int id, String name, int age ) {
            this.id=id;
            this.name = name;
            this.age = age;

        }
    }
    public static void main(String[] args) {
        Map<Integer, Person>toyMap=new HashMap<>();
        Person toy=new Person(1,"Peshko",18);
        String path="D:\\Sirma\\Streams\\src\\Task11Serialize.txt";
        try (FileOutputStream fos=new FileOutputStream(path);
             ObjectOutputStream oos=new ObjectOutputStream(fos)){
            oos.writeObject(toy);
        }catch (IOException e){
            e.printStackTrace();
        }
        try(FileInputStream fis=new FileInputStream(path);
        ObjectInputStream ois=new ObjectInputStream(fis)){
            Person person=(Person) ois.readObject();
            System.out.println(person.id);
            System.out.println(person.name);
            System.out.println(person.age);

        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
