package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SkipPunctuation {
    public static void main(String[] args) {


        String inputPath = "D:\\Sirma\\Streams\\src\\input.txt";
        String outputPath = "D:\\Sirma\\Streams\\src\\output.txt";
        File inFile=new File(inputPath);
        File outFile=new File(outputPath);
        try (  FileWriter fw=new FileWriter(inFile,true);
               BufferedWriter bufferedWriter=new BufferedWriter(fw)){
            if (!inFile.exists()) {
                inFile.createNewFile();
            }
            if (!outFile.exists()) {
                outFile.createNewFile();
            }

            bufferedWriter.write("First line");
            bufferedWriter.newLine();
            bufferedWriter.write("Second! ,,, line...@");
            bufferedWriter.newLine();
            bufferedWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }

        List<Character> symbols = new ArrayList<>();
        Collections.addAll(symbols, '.', ',', '!', '?');
        try (InputStream in = new FileInputStream(inputPath);
             OutputStream out = new FileOutputStream(outputPath)) {
            int oneByte;
            String line;
            while ((oneByte = in.read()) >= 0) {
                if (!symbols.contains((char) oneByte)) {
                    out.write(oneByte);
                    System.out.print((char) oneByte);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
