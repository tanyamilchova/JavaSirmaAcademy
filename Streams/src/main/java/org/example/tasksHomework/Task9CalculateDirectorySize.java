package org.example.tasksHomework;

import java.io.File;

public class Task9CalculateDirectorySize {
    public static void main(String[] args) {
        int coountFiles=0;
        String path="D:\\Sirma\\Streams\\src\\main\\java\\org\\example";
        File file=new File(path);
        int result=listChilds(file,coountFiles);
        System.out.println(result);

    }
    public static int listChilds(File file, int countFiles){
//        if(file.isDirectory()){
//            File[]files=file.listFiles();
//            if(files!=null) {
//                for (File f : files) {
//                    countFiles = listChilds(f, countFiles);
//                }
//            }
//        }else {
//            countFiles++;
//        }
//        return countFiles;
//    }
        if(file.isDirectory()){
            File[]files=file.listFiles();
            if(files!=null) {
                for (File f : files) {
                    countFiles=(int) f.length();
                    countFiles = listChilds(f, countFiles);
                }
            }
        }else {
            countFiles++;
        }
        return countFiles;
    }
}
