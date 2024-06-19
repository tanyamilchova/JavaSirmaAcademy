package org.example.tasksHomework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Task7CountUniqueWords {
    public static void main(String[] args) {
        String path="D:\\Sirma\\Streams\\src\\Task7UniqueWordsPrint";
        try(BufferedReader in=new BufferedReader(new FileReader(path))){
            Map<String,Integer> map=new HashMap<>();
            String line;
//            List<Character> symbols = new ArrayList<>();
//            Collections.addAll(symbols, '.', ',', '!', '?');

            while ((line=in.readLine())!=null){
//                ArrayList<Character>worsdList=new ArrayList<>();
//                for (int i = 0; i < line.length(); i++) {
//                    if( ! symbols.contains(line.charAt(i))){
//                        worsdList.add(line.charAt(i));
//                    }
//                }
//                System.out.println(worsdList);
                String[]words=line.split("[ ,.!?]+");
                System.out.println(Arrays.toString(words));
                for (String word:words) {
                    if (! map.containsKey(word.trim())) {
                        map.put(word.trim(),0);
                    }
                }
            }
            System.out.println(map.keySet().size());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
