package org.example;

import java.io.*;

public class BufferReader {
    public static void main(String[] args) {
        String path="src/MyFileSRC";
        String outPath="src/outPath";
        try (BufferedReader in=new BufferedReader(new FileReader(path));
            PrintWriter out=new PrintWriter(new FileWriter(outPath))){
               int counter=1;
               String line=in.readLine();
               while(line!=null){
                   if(counter%2==0) {
                       out.println(line);
                   }
                       counter++;
                       line=in.readLine();

               }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
