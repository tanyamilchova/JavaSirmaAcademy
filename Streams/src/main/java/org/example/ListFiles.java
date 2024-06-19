package org.example;

import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        File file=new File("D:\\");
        if(file.exists()){
            if(file.isDirectory()){
                File[]files=file.listFiles();
                for (File f:files){
                    System.out.printf("%s: [%s]%n",
                            f.getName(),f.length());
                }
            }
        }
    }
}
