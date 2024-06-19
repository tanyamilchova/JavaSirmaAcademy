package org.example;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;

public class NestedDirectories {
    public static void main(String[] args) {
        String path="D:\\";
        File root=new File(path);
        Deque<File>dirs=new ArrayDeque<>();
        dirs.offer(root);
        int count=0;
        while (!dirs.isEmpty()){
            File current=dirs.poll();
            System.out.println(current.getName()+" -curName");
            File[]nestedFiles=current.listFiles();
            if(nestedFiles!=null) {
                for (File nestedFile : nestedFiles) {
                    if (nestedFile != null && nestedFile.isDirectory()) {
                        dirs.offer(nestedFile);
                        count++;
                        System.out.println(nestedFile.getName());

                    }
                }
            }

        }
        System.out.println(count+" folders");
    }
}
