package org.example.tasksHomework;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Task5ExtractFile {
    public static void main(String[] args) {
        Path path= Paths.get("D:\\Sirma\\Streams\\src\\Task5.txt");
        String filePath= String.valueOf(path.getFileName());

        String[]pathTrace=filePath.split("\\.");
        System.out.println(Arrays.toString(pathTrace));
        String name="";
        String extention="";
        if(pathTrace.length>=2) {
                 name = pathTrace[0].trim();
                 extention = pathTrace[1].trim();
            }
        System.out.println("File name: "+name);
        System.out.println("File extention: "+extention);
    }
}
