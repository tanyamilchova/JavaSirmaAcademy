package org.example.tasksHomework;

import java.io.*;

public class Task8MergeLinesFromTwoFiles {
    public static void main(String[] args) {
        String input1="D:\\Sirma\\Streams\\src\\Task8FirstPart";
        String input2="D:\\Sirma\\Streams\\src\\Task8SecondPart";
        String outout="D:\\Sirma\\Streams\\src\\Task8Output";
        try (BufferedReader reader=new BufferedReader(new FileReader(input1));
             BufferedReader reader1=new BufferedReader(new FileReader(input2));
             BufferedWriter writer=new BufferedWriter(new FileWriter(outout))){
            String line;
            while ((line=reader.readLine())!=null){
                writer.write(line);
            }
            while ((line=reader1.readLine())!=null){
                writer.write(line);
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
