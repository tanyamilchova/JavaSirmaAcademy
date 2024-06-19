package org.example;

import java.io.File;
import java.util.Arrays;

public class FileDirectory {
    public static void main(String[] args) {
        File file=new File("D:\\Sirma\\src\\newFileCreated");
        File oldFile=new File("D:\\Sirma\\Streams\\src\\FileDirectory");
        boolean isExisting=oldFile.exists();
        long lengthOldFile= oldFile.length();
        boolean isDirectory= file.isDirectory();
        System.out.println("Exist? :"+isExisting);
        System.out.println("Is a directory ?:"+isDirectory);
        File[]files=oldFile.listFiles();
        System.out.println(Arrays.toString(files));
    }
}
