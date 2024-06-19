package org.example.tasksHomework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task4CountLinesWordsCharacters {
    public static void main(String[] args) {
        String path="D:\\Sirma\\Streams\\src\\Task5CountWords";
        try(FileReader reader=new FileReader(path);
            BufferedReader bufferedReader=new BufferedReader(reader)){
            int countWords=0;
            int countLetters=0;
            int countSentences=0;
            String line;
            while ((line=bufferedReader.readLine())!=null){
                countSentences++;
                String[]words=line.split(" ");
                countWords+=words.length;
                for (String word:words){
                    countLetters+=word.trim().length();
                }
            }
            System.out.println("Sentence "+countSentences);
            System.out.println("Words: "+countWords);
            System.out.println("Symbols: "+countLetters);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
