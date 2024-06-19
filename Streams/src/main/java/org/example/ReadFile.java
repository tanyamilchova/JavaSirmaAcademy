package org.example;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) throws IOException {

        File file=new File("D:\\Sirma\\Streams\\src\\MyFileSRC2");
        if(!file.exists()){
            file.createNewFile();
        }else {
            System.out.printf("File exists");
            System.out.println();
        }
        try (
            FileWriter writer= new FileWriter(file,true);
            BufferedWriter bufferedWriter=new BufferedWriter(writer);) {
            bufferedWriter.write("Start paragraph");
            bufferedWriter.newLine();
            bufferedWriter.write("Second line");
            bufferedWriter.newLine();

        }
        catch (IOException e){
            e.printStackTrace();
        }




        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
