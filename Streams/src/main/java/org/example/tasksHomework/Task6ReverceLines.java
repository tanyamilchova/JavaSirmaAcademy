package org.example.tasksHomework;

import java.io.*;

public class Task6ReverceLines {
    public static void main(String[] args) {
        String inPath="D:\\Sirma\\Streams\\src\\Task6Input";
        String outPath="D:\\Sirma\\Streams\\src\\Task6Output";
        try(BufferedReader in=new BufferedReader(new FileReader(inPath));
            BufferedWriter out=new BufferedWriter(new FileWriter(outPath))){
            String line;
            while ((line=in.readLine())!=null){
                StringBuilder b=new StringBuilder();
                for (int i = line.length()-1; i >=0 ; i--) {
                    b.append(line.charAt(i));
                }
                out.write(b.toString()+"\n");
//                System.out.println();

            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
