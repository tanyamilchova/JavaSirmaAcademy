package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class AllLinesInList {
    public static void main(String[] args) {
        Path inpath= Paths.get("D:\\Sirma\\Streams\\src\\fileParh");
        Path outPath=Paths.get("D:\\Sirma\\Streams\\src\\outPathAll");
        List<String> lines= null;
        try {
            lines = Files.readAllLines(inpath);
            Files.write(outPath,lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(lines);

    }
}
