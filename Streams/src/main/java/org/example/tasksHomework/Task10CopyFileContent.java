package org.example.tasksHomework;

import java.io.*;

public class Task10CopyFileContent {
    public static void main(String[] args) {


    String input1="D:\\Sirma\\Streams\\src\\Task10Input";

    String outout="D:\\Sirma\\Streams\\src\\Task10Output";
        try (
    BufferedReader reader=new BufferedReader(new FileReader(input1));

    BufferedWriter writer=new BufferedWriter(new FileWriter(outout))){
        String line;
        while ((line=reader.readLine())!=null){
            writer.write(line+"\n");
        }


    }catch (
    IOException e){
        System.out.println(e.getMessage());
    }
}
}
