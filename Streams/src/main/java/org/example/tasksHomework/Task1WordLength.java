package org.example.tasksHomework;

import java.io.*;

public class Task1WordLength {
    public static void main(String[] args) {
        String path="D:\\Sirma\\Streams\\src\\Task1File";

        try(FileReader fileReader=new FileReader(path);
        BufferedReader br=new BufferedReader(fileReader)){
            String line;
            while ((line=br.readLine())!=null){
                String[]words=line.split(" ");
                for (String word:words){
                    System.out.printf("%s: %d symbols ",word,word.length());
                    System.out.println();
                }
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
