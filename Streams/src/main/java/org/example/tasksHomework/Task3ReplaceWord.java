package org.example.tasksHomework;

import java.io.*;

public class Task3ReplaceWord {
    public static void main(String[] args) {
        String path="D:\\Sirma\\Streams\\src\\Task3ReplaceWord";
        String out="D:\\Sirma\\Streams\\src\\Task3Out";
        try(FileReader in=new FileReader(path);
            BufferedReader br=new BufferedReader(in);
            FileWriter outWr=new FileWriter(out);
            BufferedWriter bw=new BufferedWriter(outWr)){
            String line;
            while ((line= br.readLine())!=null){
                String replacedStr=line.replace("Java","HTML");
                bw.write(replacedStr);
            }
        }
        catch (IOException e){
            e.getMessage();
        }
    }
}
