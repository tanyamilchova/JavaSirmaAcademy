package org.example.tasksHomework;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Task11MapSer {


    public static void main(String[] args) {
        Map<String, Integer>map=new HashMap<>();
        map.put("Sully",1);
        map.put("Peny",2);
        String path="D:\\Sirma\\Streams\\src\\Task11Map.txt";

        try (ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(path))){
        oos.writeObject(map);

        }catch (IOException e){
            e.printStackTrace();
        }
        try (ObjectInputStream ois=new ObjectInputStream(new FileInputStream(path))){
            Map<String,Integer>resMap=(Map<String, Integer>) ois.readObject();
            printMap(resMap);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }


    }
    public  static void printMap(Map<String,Integer>map){
        for (Map.Entry<String,Integer>e:map.entrySet()){
            System.out.println(e.getKey()+":"+e.getValue());
        }
    }
}
