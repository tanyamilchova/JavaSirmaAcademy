package org.example.io;

import org.example.AbstractItem;
import org.example.Inventory;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileStorage {
    private Inventory inventory;

    public void storeInFile(Inventory inventory) {
//        Map<AbstractItem.CATEGORY, ArrayList<Inventory>> map = new HashMap<>();
//                map=inventory.inventoryHashMap;
        Map<AbstractItem.CATEGORY, ArrayList<Inventory>> map = inventory.inventoryHashMap;
        String path = "D:\\Sirma\\InventoryManagementSystem\\src\\main\\java\\org\\example\\io\\outputFile.txt";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeObject(map);
            System.out.println("The map successfully stored in file: "+path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Map<AbstractItem.CATEGORY,ArrayList<Inventory>>extractMap(){
        String path = "D:\\Sirma\\InventoryManagementSystem\\src\\main\\java\\org\\example\\io\\outputFile.txt";
        Map<AbstractItem.CATEGORY,ArrayList<Inventory>>map=new HashMap<>();
        try (ObjectInputStream ois=new ObjectInputStream(new FileInputStream(path))){
          map=(Map<AbstractItem.CATEGORY, ArrayList<Inventory>>) ois.readObject();

        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("The map successfully extracted:");
        printMap(map);
        return map;
    }
    public void printMap(Map<AbstractItem.CATEGORY,ArrayList<Inventory>>map){
        for (Map.Entry e:map.entrySet()){
            System.out.println(e.getKey()+":"+e.getValue());
        }
    }
}

