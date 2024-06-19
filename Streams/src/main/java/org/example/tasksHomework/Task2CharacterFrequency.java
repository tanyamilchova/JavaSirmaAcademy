package org.example.tasksHomework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Task2CharacterFrequency {
    public static void main(String[] args) {
        String path="D:\\Sirma\\Streams\\src\\Task2CharCounter";
        try(FileReader in=new FileReader(path);
            BufferedReader br=new BufferedReader(in)){
            Map<Character,Integer> map=new HashMap<>();
            String line;

            while ((line=br.readLine())!=null){
                for (int i = 0; i < line.length(); i++) {
                    int counter=0;
                    char currentKey = line.charAt(i);
                    if (!map.containsKey(currentKey)) {
                        map.put(currentKey, 0);
                    }
                    for (int j = 0; j < line.length(); j++) {
                        if (line.charAt(j) == currentKey) {
                            counter++;
                        }
                    }
                    map.put(currentKey,counter);
                }
            }
            printMap(map);
        }catch (IOException e){
            e.getMessage();
        }
    }
    public static void printMap(Map<Character,Integer>map){
        for (Map.Entry<Character,Integer>e:map.entrySet()){
            System.out.println(e.getKey()+":"+e.getValue());
        }
    }
}
