package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SerializationExample {
    public static void main(String[] args) {
       String path="D:\\Sirma\\Streams\\src\\objectOutput'Stream.txt";
        List<String>names=new ArrayList<>();
        Collections.addAll(names,"Marry","George");

        try (FileOutputStream fos= new FileOutputStream(path);
             ObjectOutputStream oos=new ObjectOutputStream(fos)){
            oos.writeObject(names);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(FileInputStream fis=new FileInputStream(path);
            ObjectInputStream ois=new ObjectInputStream(fis)){
            List<String>namesSer=(List<String>) ois.readObject();
            for (String str:namesSer){
                System.out.println(str);
            }
        }catch (IOException  | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
}
